package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PieceGenerator.Context.class)
public class Context531046882Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1916559141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916559141L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__604413093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604413093L))
            info.setReturnValue("^0(CN{BT\uFF3751");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_569309624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569309624L))
            info.setReturnValue(523389852);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_569310089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569310089L))
            info.setReturnValue(-1802353610310580361L);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config_829901054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829901054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/world/level/levelgen/WorldgenRandom;", cancellable = true)
    private void random__1053789634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053789634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__358051955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358051955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor_568267280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568267280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__1265945524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265945524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__1640110451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640110451L))
            info.setReturnValue(null);
    }


}
