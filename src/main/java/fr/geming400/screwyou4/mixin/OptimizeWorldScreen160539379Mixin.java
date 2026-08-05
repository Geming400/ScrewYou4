package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.OptimizeWorldScreen.class)
public class OptimizeWorldScreen160539379Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Z)Lnet/minecraft/client/gui/screens/worldselection/OptimizeWorldScreen;", cancellable = true)
    private static void create_390944313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390944313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_198814118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198814118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_198814118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198814118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_198814118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198814118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__799147993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-799147993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_198817962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198817962L))
            info.setReturnValue(true);
    }


}
