package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.BiomeBuilder.class)
public class BiomeBuilder1073332069Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__62128402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62128402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private void build__1067741964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067741964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void setAttribute_1082637451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082637451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasPrecipitation(Z)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void hasPrecipitation__1325383745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325383745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature(F)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void temperature__1732131245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732131245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "downfall(F)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void downfall__1732131245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732131245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generationSettings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void generationSettings__533731358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533731358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobSpawnSettings(Lnet/minecraft/world/level/biome/MobSpawnSettings;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void mobSpawnSettings__2104206557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104206557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialEffects(Lnet/minecraft/world/level/biome/BiomeSpecialEffects;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void specialEffects__65129712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65129712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperatureAdjustment(Lnet/minecraft/world/level/biome/Biome$TemperatureModifier;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void temperatureAdjustment__499778610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499778610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putAttributes(Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void putAttributes_541343864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541343864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putAttributes(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void putAttributes__1005972063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005972063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifyAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/lang/Object;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void modifyAttribute__584902533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584902533L))
            info.setReturnValue(null);
    }


}
