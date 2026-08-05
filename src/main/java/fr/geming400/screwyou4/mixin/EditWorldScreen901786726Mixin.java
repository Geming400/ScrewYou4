package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.EditWorldScreen.class)
public class EditWorldScreen901786726Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;)Lnet/minecraft/client/gui/screens/worldselection/EditWorldScreen;", cancellable = true)
    private static void create_1154711647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154711647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_940061465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940061465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__57900646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57900646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "conditionallyMakeBackupAndShowToast(ZLnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void conditionallyMakeBackupAndShowToast_2125029483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125029483L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__14848988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14848988L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "makeBackupAndShowToast(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void makeBackupAndShowToast_420232289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420232289L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
