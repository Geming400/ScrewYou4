package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.Builder.class)
public class Builder_2129243301Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/MobSpawnSettings;", cancellable = true)
    private void build_1246009929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246009929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMobCharge(Lnet/minecraft/world/entity/EntityType;DD)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void addMobCharge_1586740339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586740339L))
            info.setReturnValue(new net.minecraft.world.level.biome.MobSpawnSettings.Builder());
    }

    @Inject(at = @At("HEAD"), method = "creatureGenerationProbability(F)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void creatureGenerationProbability__1485499684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485499684L))
            info.setReturnValue(new net.minecraft.world.level.biome.MobSpawnSettings.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addSpawn(Lnet/minecraft/world/entity/MobCategory;ILnet/minecraft/world/level/biome/MobSpawnSettings$SpawnerData;)Lnet/minecraft/world/level/biome/MobSpawnSettings$Builder;", cancellable = true)
    private void addSpawn_2022339853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022339853L))
            info.setReturnValue(new net.minecraft.world.level.biome.MobSpawnSettings.Builder());
    }


}
