package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.Builder.class)
public class Builder_2129243301Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/MobSpawnSettings;", cancellable = true)
    private void build_701268535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701268535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addSpawn(Lnet/minecraft/world/entity/MobCategory;ILnet/minecraft/world/level/biome/MobSpawnSettings$SpawnerData;)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void addSpawn__342508045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342508045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMobCharge(Lnet/minecraft/world/entity/EntityType;DD)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void addMobCharge_2112769760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112769760L))
            info.setReturnValue(new net.minecraft.world.level.biome.MobSpawnSettings.Builder());
    }

    @Inject(at = @At("HEAD"), method = "creatureGenerationProbability(F)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void creatureGenerationProbability_50942494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50942494L))
            info.setReturnValue(new net.minecraft.world.level.biome.MobSpawnSettings.Builder());
    }


}
