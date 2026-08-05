package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeGenerationSettings.PlainBuilder.class)
public class PlainBuilder_1781019360Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void build_1097749477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097749477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFeature(ILnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addFeature__1605264761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605264761L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeGenerationSettings.PlainBuilder());
    }

    @Inject(at = @At("HEAD"), method = "addFeature(Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addFeature__220669014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220669014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCarver(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings$PlainBuilder;", cancellable = true)
    private void addCarver__1145612951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145612951L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeGenerationSettings.PlainBuilder());
    }


}
