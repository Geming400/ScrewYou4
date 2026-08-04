package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeGenerationSettings.PlainBuilder.class)
public class PlainBuilder_1781019360Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void build__1811913837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811913837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCarver(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addCarver__1578208583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578208583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFeature(ILnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addFeature_1796794162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796794162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFeature(Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addFeature__1136025889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136025889L))
            info.setReturnValue(null);
    }


}
