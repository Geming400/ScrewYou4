package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.GenerationContext.class)
public class GenerationContext1280460080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_371833812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371833812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2050883605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050883605L))
            info.setReturnValue("Qc#6Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1837812171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837812171L))
            info.setReturnValue(794548957);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1856548614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856548614L))
            info.setReturnValue(4935628174945949618L);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/world/level/levelgen/WorldgenRandom;", cancellable = true)
    private void random_1203327337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203327337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__585161598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585161598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_225566870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225566870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor_2009202192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009202192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__1203347195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203347195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeSource()Lnet/minecraft/world/level/biome/BiomeSource;", cancellable = true)
    private void biomeSource__1764335447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764335447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiome()Ljava/util/function/Predicate;", cancellable = true)
    private void validBiome_96785666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96785666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__418851968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418851968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__1599322693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599322693L))
            info.setReturnValue(null);
    }


}
