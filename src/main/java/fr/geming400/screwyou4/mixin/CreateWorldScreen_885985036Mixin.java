package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.CreateWorldScreen.class)
public class CreateWorldScreen_885985036Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_924259774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924259774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__30650679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30650679L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "repositionElements()V", cancellable = true)
    private void repositionElements_924259774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924259774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__73702337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-73702337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromExisting(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;Ljava/nio/file/Path;)Lnet/minecraft/client/gui/screens/worldselection/CreateWorldScreen;", cancellable = true)
    private static void createFromExisting__1430358063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430358063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUiState()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState;", cancellable = true)
    private void getUiState_1099587204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099587204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testWorld(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;)V", cancellable = true)
    private static void testWorld_1622047014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1622047014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popScreen()V", cancellable = true)
    private void popScreen_924259774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(924259774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFresh(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;)V", cancellable = true)
    private static void openFresh_1622047014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1622047014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFresh(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;Lnet/minecraft/client/gui/screens/worldselection/CreateWorldCallback;)V", cancellable = true)
    private static void openFresh__1030558709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1030558709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTempDataPackDirFromExistingWorld(Ljava/nio/file/Path;Lnet/minecraft/client/Minecraft;)Ljava/nio/file/Path;", cancellable = true)
    private static void createTempDataPackDirFromExistingWorld_2022697456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022697456L))
            info.setReturnValue(null);
    }


}
