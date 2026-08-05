package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.GaussianSampler.class)
public class GaussianSampler305565279Mixin {
        @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/attribute/GaussianSampler$Sampler;Lnet/minecraft/world/attribute/GaussianSampler$Accumulator;)V", cancellable = true)
    private static void sample_997240770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(997240770L))
            info.cancel();
    }


}
