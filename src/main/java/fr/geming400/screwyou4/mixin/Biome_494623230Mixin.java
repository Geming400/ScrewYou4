package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.class)
public class Biome_494623230Mixin {
        @Inject(at = @At("HEAD"), method = "getAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void getAttributes__1789043374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789043374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldSnow(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldSnow__608253156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608253156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPrecipitationAt(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private void getPrecipitationAt__1312009326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312009326L))
            info.setReturnValue(net.minecraft.world.level.biome.Biome.Precipitation.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "shouldFreeze(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldFreeze__608253156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608253156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldFreeze(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void shouldFreeze_708178262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708178262L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMobSettings()Lnet/minecraft/world/level/biome/MobSpawnSettings;", cancellable = true)
    private void getMobSettings__388610142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388610142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPrecipitation()Z", cancellable = true)
    private void hasPrecipitation_532901812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532901812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "warmEnoughToRain(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void warmEnoughToRain_1458824409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458824409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFoliageColor()I", cancellable = true)
    private void getFoliageColor_532885475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532885475L))
            info.setReturnValue(-1136039398);
    }

    @Inject(at = @At("HEAD"), method = "coldEnoughToSnow(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void coldEnoughToSnow_1458824409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458824409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGrassColor(DD)I", cancellable = true)
    private void getGrassColor__649032093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649032093L))
            info.setReturnValue(1111681120);
    }

    @Inject(at = @At("HEAD"), method = "getSpecialEffects()Lnet/minecraft/world/level/biome/BiomeSpecialEffects;", cancellable = true)
    private void getSpecialEffects__1755282877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755282877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDryFoliageColor()I", cancellable = true)
    private void getDryFoliageColor_532885475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532885475L))
            info.setReturnValue(-1136039398);
    }

    @Inject(at = @At("HEAD"), method = "getBaseTemperature()F", cancellable = true)
    private void getBaseTemperature_532882592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532882592L))
            info.setReturnValue(3.633497E8F);
    }

    @Inject(at = @At("HEAD"), method = "getWaterColor()I", cancellable = true)
    private void getWaterColor_532885475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532885475L))
            info.setReturnValue(-1136039398);
    }

    @Inject(at = @At("HEAD"), method = "shouldMeltFrozenOceanIcebergSlightly(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void shouldMeltFrozenOceanIcebergSlightly_1458824409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458824409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGenerationSettings()Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void getGenerationSettings_1196657329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196657329L))
            info.setReturnValue(null);
    }


}
