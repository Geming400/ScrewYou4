package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeSpecialEffects.Builder.class)
public class Builder_395207046Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/BiomeSpecialEffects;", cancellable = true)
    private void build__1854699061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854699061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliageColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void foliageColorOverride__1271804019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271804019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void grassColorOverride__1271804019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271804019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryFoliageColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void dryFoliageColorOverride__1271804019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271804019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassColorModifier(Lnet/minecraft/world/level/biome/BiomeSpecialEffects$GrassColorModifier;)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void grassColorModifier__292507495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292507495L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeSpecialEffects$Builder());
    }

    @Inject(at = @At("HEAD"), method = "waterColor(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void waterColor__1271804019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271804019L))
            info.setReturnValue(null);
    }


}
