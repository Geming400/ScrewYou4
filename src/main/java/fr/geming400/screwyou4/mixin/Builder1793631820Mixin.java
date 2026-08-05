package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeGenerationSettings.Builder.class)
public class Builder1793631820Mixin {
        @Inject(at = @At("HEAD"), method = "addFeature(Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;", cancellable = true)
    private void addFeature__438500889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438500889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCarver(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;", cancellable = true)
    private void addCarver_1766098509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766098509L))
            info.setReturnValue(null);
    }


}
