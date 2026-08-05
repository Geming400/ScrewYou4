package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.WorldListEntry.class)
public class WorldListEntry1611745136Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelName()Ljava/lang/String;", cancellable = true)
    private void getLevelName_476284665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476284665L))
            info.setReturnValue("w0p/ z#痾nLJBo*TIr$>zૂ5:f⾈3Xog;⃓쓩O鸇>A(L薜.}᐀*k?Rb");
    }

    @Inject(at = @At("HEAD"), method = "joinWorld()V", cancellable = true)
    private void joinWorld_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "editWorld()V", cancellable = true)
    private void editWorld_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_695109422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695109422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doDeleteWorld()V", cancellable = true)
    private void doDeleteWorld_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateWorld()V", cancellable = true)
    private void recreateWorld_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteWorld()V", cancellable = true)
    private void deleteWorld_1650019875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650019875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevelSummary()Lnet/minecraft/world/level/storage/LevelSummary;", cancellable = true)
    private void getLevelSummary_1695398732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695398732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canInteract()Z", cancellable = true)
    private void canInteract_1650023719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650023719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__2913742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2913742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent__1771547100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1771547100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__565164029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565164029L))
            info.setReturnValue(null);
    }


}
