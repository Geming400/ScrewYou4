package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerTabOverlay.class)
public class PlayerTabOverlay_879407306Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_917682044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(917682044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNameForDisplay(Lnet/minecraft/client/multiplayer/PlayerInfo;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNameForDisplay__1245283943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245283943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHeader(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setHeader__1021771632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021771632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFooter(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setFooter__1021771632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021771632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;ILnet/minecraft/world/scores/Scoreboard;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void extractRenderState_374024753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(374024753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible_2109024134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2109024134L))
            info.cancel();
    }


}
