package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Biome.BiomeBuilder.class)
public class BiomeBuilder1073332069Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1843755098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843755098L))
            info.setReturnValue("%w#lI(=s");
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/biome/Biome;", cancellable = true)
    private void build_49630662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49630662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/lang/Object;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void setAttribute_979912549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979912549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobSpawnSettings(Lnet/minecraft/world/level/biome/MobSpawnSettings;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void mobSpawnSettings__1497704639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497704639L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "temperatureAdjustment(Lnet/minecraft/world/level/biome/Biome$TemperatureModifier;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void temperatureAdjustment__1801449427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801449427L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "putAttributes(Lnet/minecraft/world/attribute/EnvironmentAttributeMap$Builder;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void putAttributes__967804942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-967804942L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "putAttributes(Lnet/minecraft/world/attribute/EnvironmentAttributeMap;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void putAttributes_1784309531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784309531L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "modifyAttribute(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/lang/Object;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void modifyAttribute__1849324163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849324163L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "generationSettings(Lnet/minecraft/world/level/biome/BiomeGenerationSettings;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void generationSettings__624935961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624935961L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "specialEffects(Lnet/minecraft/world/level/biome/BiomeSpecialEffects;)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void specialEffects__992118873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992118873L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "hasPrecipitation(Z)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void hasPrecipitation__1715819306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715819306L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }

    @Inject(at = @At("HEAD"), method = "temperature(F)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void temperature_760159071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760159071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "downfall(F)Lnet/minecraft/world/level/biome/Biome$BiomeBuilder;", cancellable = true)
    private void downfall__1053955626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053955626L))
            info.setReturnValue(new net.minecraft.world.level.biome.Biome.BiomeBuilder());
    }


}
