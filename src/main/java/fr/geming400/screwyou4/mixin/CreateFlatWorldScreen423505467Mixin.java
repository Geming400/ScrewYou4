package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.CreateFlatWorldScreen.class)
public class CreateFlatWorldScreen423505467Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_461780206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461780206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings__1303079473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303079473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setConfig(Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;)V", cancellable = true)
    private void setConfig__603637117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-603637117L))
            info.cancel();
    }


}
