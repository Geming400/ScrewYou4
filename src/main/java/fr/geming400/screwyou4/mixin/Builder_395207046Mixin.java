package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeSpecialEffects.Builder.class)
public class Builder_395207046Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/BiomeSpecialEffects;", cancellable = true)
    private void build_435843869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435843869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void grassColorOverride__853811322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853811322L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder());
    }

    @Inject(at = @At("HEAD"), method = "grassColorModifier(Lnet/minecraft/world/level/biome/BiomeSpecialEffects$GrassColorModifier;)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void grassColorModifier_1497510869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497510869L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder());
    }

    @Inject(at = @At("HEAD"), method = "foliageColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void foliageColorOverride_646085539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646085539L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder());
    }

    @Inject(at = @At("HEAD"), method = "dryFoliageColorOverride(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void dryFoliageColorOverride__2083884242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083884242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterColor(I)Lnet/minecraft/world/level/biome/BiomeSpecialEffects$Builder;", cancellable = true)
    private void waterColor_639208729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639208729L))
            info.setReturnValue(new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder());
    }


}
