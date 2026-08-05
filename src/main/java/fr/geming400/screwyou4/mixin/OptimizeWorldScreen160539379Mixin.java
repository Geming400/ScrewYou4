package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.OptimizeWorldScreen.class)
public class OptimizeWorldScreen160539379Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;Lcom/mojang/datafixers/DataFixer;Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Z)Lnet/minecraft/client/gui/screens/worldselection/OptimizeWorldScreen;", cancellable = true)
    private static void create_678074677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678074677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed__278540986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-278540986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1386554861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1386554861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_30855721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(30855721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc__428556999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428556999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1147419021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147419021L))
            info.cancel();
    }


}
