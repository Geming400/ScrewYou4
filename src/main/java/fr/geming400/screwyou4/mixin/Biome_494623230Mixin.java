package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.class)
public class Biome_494623230Mixin {
        @Inject(at = @At("HEAD"), method = "getAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeMap;", cancellable = true)
    private void getAttributes_1902282725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902282725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDryFoliageColor()I", cancellable = true)
    private void getDryFoliageColor_627955844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627955844L))
            info.setReturnValue(-1354138407);
    }

    @Inject(at = @At("HEAD"), method = "warmEnoughToRain(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void warmEnoughToRain__1609103115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609103115L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWaterColor()I", cancellable = true)
    private void getWaterColor__2034669407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034669407L))
            info.setReturnValue(1982546505);
    }

    @Inject(at = @At("HEAD"), method = "getBaseTemperature()F", cancellable = true)
    private void getBaseTemperature_1314647315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314647315L))
            info.setReturnValue(5.792224E8F);
    }

    @Inject(at = @At("HEAD"), method = "coldEnoughToSnow(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void coldEnoughToSnow__780051865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780051865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFoliageColor()I", cancellable = true)
    private void getFoliageColor__435733053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435733053L))
            info.setReturnValue(998885298);
    }

    @Inject(at = @At("HEAD"), method = "getGrassColor(DD)I", cancellable = true)
    private void getGrassColor__385313344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385313344L))
            info.setReturnValue(-745344722);
    }

    @Inject(at = @At("HEAD"), method = "getSpecialEffects()Lnet/minecraft/world/level/biome/BiomeSpecialEffects;", cancellable = true)
    private void getSpecialEffects_629719076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629719076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPrecipitation()Z", cancellable = true)
    private void hasPrecipitation_535308875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(535308875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMobSettings()Lnet/minecraft/world/level/biome/MobSpawnSettings;", cancellable = true)
    private void getMobSettings_48638447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48638447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldSnow(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldSnow__83705338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83705338L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldFreeze(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldFreeze__1565327310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565327310L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldFreeze(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void shouldFreeze_1103650560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103650560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPrecipitationAt(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private void getPrecipitationAt__38750542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38750542L))
            info.setReturnValue(net.minecraft.world.level.biome.Biome.Precipitation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getGenerationSettings()Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void getGenerationSettings__2123749120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123749120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldMeltFrozenOceanIcebergSlightly(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void shouldMeltFrozenOceanIcebergSlightly_2125206769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125206769L))
            info.setReturnValue(true);
    }


}
