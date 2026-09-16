package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.EditWorldScreen.class)
public class EditWorldScreen901786726Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;)Lnet/minecraft/client/gui/screens/worldselection/EditWorldScreen;", cancellable = true)
    private static void create__573792165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573792165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2127802208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2127802208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_870733095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870733095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1888666368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888666368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeBackupAndShowToast(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void makeBackupAndShowToast__659202626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659202626L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "conditionallyMakeBackupAndShowToast(ZLnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void conditionallyMakeBackupAndShowToast_1581804769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581804769L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
