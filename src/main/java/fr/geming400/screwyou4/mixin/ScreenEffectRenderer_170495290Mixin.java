package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ScreenEffectRenderer.class)
public class ScreenEffectRenderer_170495290Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_40811631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(40811631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(ZZFLnet/minecraft/client/renderer/SubmitNodeCollector;Z)V", cancellable = true)
    private void submit_599840292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599840292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "displayItemActivation(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void displayItemActivation_423762994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(423762994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetItemActivation()V", cancellable = true)
    private void resetItemActivation__2011080908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011080908L))
            info.cancel();
    }


}
