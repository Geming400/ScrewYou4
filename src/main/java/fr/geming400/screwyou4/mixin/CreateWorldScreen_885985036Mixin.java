package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.CreateWorldScreen.class)
public class CreateWorldScreen_885985036Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2112000517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112000517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_854931404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854931404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUiState()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState;", cancellable = true)
    private void getUiState_1375231979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375231979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testWorld(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;)V", cancellable = true)
    private static void testWorld_1318562566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1318562566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "repositionElements()V", cancellable = true)
    private void repositionElements__2034845653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2034845653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1872864677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872864677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFresh(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;Lnet/minecraft/client/gui/screens/worldselection/CreateWorldCallback;)V", cancellable = true)
    private static void openFresh__2129846769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2129846769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openFresh(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;)V", cancellable = true)
    private static void openFresh__1511000926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511000926L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popScreen()V", cancellable = true)
    private void popScreen_739164609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(739164609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTempDataPackDirFromExistingWorld(Ljava/nio/file/Path;Lnet/minecraft/client/Minecraft;)Ljava/nio/file/Path;", cancellable = true)
    private static void createTempDataPackDirFromExistingWorld__103110093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103110093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromExisting(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;Lnet/minecraft/world/level/LevelSettings;Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;Ljava/nio/file/Path;)Lnet/minecraft/client/gui/screens/worldselection/CreateWorldScreen;", cancellable = true)
    private static void createFromExisting_1748042370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748042370L))
            info.setReturnValue(null);
    }


}
