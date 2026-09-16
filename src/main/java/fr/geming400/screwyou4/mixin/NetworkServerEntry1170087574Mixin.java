package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.NetworkServerEntry.class)
public class NetworkServerEntry1170087574Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join_622981727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(622981727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1139033943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139033943L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_629581398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629581398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1684845058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1684845058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_1888252181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888252181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getServerNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getServerNarration__1943908014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943908014L))
            info.setReturnValue(null);
    }


}
