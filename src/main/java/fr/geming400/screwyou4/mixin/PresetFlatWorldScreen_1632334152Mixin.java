package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.PresetFlatWorldScreen.class)
public class PresetFlatWorldScreen_1632334152Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_514717670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(514717670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1436617663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1436617663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromString(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Ljava/lang/String;Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private static void fromString_2021335407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021335407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateButtonValidity(Z)V", cancellable = true)
    private void updateButtonValidity_1930892273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1930892273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1834917075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834917075L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1675753503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1675753503L))
            info.cancel();
    }


}
