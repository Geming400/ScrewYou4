package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.OnlineServerEntry.class)
public class OnlineServerEntry_254673839Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join__292432009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-292432009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1859901591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1859901591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_972838445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972838445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__285832338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-285832338L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getServerData__373461891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373461891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateServerList()V", cancellable = true)
    private void updateServerList_945761399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945761399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_223620207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223620207L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_769431322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769431322L))
            info.cancel();
    }


}
