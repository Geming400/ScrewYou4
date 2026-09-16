package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.WorldListEntry.class)
public class WorldListEntry1611745136Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__502830293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-502830293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName__39923790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39923790L))
            info.setReturnValue("9C:x@}]SIvI\uA107S[zH8\uD5D7hV+a8;?i*>X\"");
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1580691505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580691505L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_1071238960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071238960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_2126502620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2126502620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1965057553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965057553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinWorld()V", cancellable = true)
    private void joinWorld_30239387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(30239387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "editWorld()V", cancellable = true)
    private void editWorld__701275269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-701275269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doDeleteWorld()V", cancellable = true)
    private void doDeleteWorld__1376386937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1376386937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateWorld()V", cancellable = true)
    private void recreateWorld_1090476064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1090476064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteWorld()V", cancellable = true)
    private void deleteWorld_495855068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495855068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canInteract()Z", cancellable = true)
    private void canInteract_2135235265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135235265L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLevelSummary()Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void getLevelSummary_1543907652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543907652L))
            info.setReturnValue(null);
    }


}
