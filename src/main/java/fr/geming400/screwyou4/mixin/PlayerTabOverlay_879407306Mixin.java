package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PlayerTabOverlay.class)
public class PlayerTabOverlay_879407306Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__850029683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-850029683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNameForDisplay(Lnet/minecraft/client/multiplayer/PlayerInfo;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNameForDisplay__474314049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474314049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFooter(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setFooter_964367315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(964367315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHeader(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setHeader__226688095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-226688095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;ILnet/minecraft/world/scores/Scoreboard;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void extractRenderState_1782996235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1782996235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible_1863294262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1863294262L))
            info.cancel();
    }


}
