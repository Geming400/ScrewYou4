package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.PresetFlatWorldScreen.class)
public class PresetFlatWorldScreen_1632334152Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_636454682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(636454682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1670608890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1670608890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromString(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Ljava/lang/String;Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private static void fromString_1314315220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314315220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_672646779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(672646779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(DDDD)Z", cancellable = true)
    private void mouseScrolled__1462721538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462721538L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateButtonValidity(Z)V", cancellable = true)
    private void updateButtonValidity__1433016316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433016316L))
            info.cancel();
    }


}
