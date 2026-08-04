package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ScreenEffectRenderer.class)
public class ScreenEffectRenderer_170495290Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_208770028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(208770028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(ZZFLnet/minecraft/client/renderer/SubmitNodeCollector;Z)V", cancellable = true)
    private void submit__2017621492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2017621492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetItemActivation()V", cancellable = true)
    private void resetItemActivation_208770028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(208770028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "displayItemActivation(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void displayItemActivation__1358342137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1358342137L))
            info.cancel();
    }


}
