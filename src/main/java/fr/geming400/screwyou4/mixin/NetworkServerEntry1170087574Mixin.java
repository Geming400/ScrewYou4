package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.NetworkServerEntry.class)
public class NetworkServerEntry1170087574Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join_1208362313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1208362313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServerNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getServerNarration__1006821591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006821591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_2081762634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081762634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1006821591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006821591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__444571304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444571304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_253451860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253451860L))
            info.setReturnValue(null);
    }


}
