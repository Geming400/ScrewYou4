package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.CreateFlatWorldScreen.class)
public class CreateFlatWorldScreen423505467Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1649520949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649520949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings_1243342578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243342578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setConfig(Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;)V", cancellable = true)
    private void setConfig_855690431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(855690431L))
            info.cancel();
    }


}
