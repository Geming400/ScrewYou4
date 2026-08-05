package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier.Context.class)
public class Context_1432645682Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1476809356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476809356L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_297185706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297185706L))
            info.setReturnValue("\uD638Z-F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470908423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470908423L))
            info.setReturnValue(890507661);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1470908888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470908888L))
            info.setReturnValue(735634042263002379L);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config_1731499853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731499853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos_543546844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543546844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeSource()Lnet/minecraft/world/level/biome/BiomeSource;", cancellable = true)
    private void biomeSource__1118194907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118194907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor_1469866079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469866079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiome()Ljava/util/function/Predicate;", cancellable = true)
    private void validBiome_782760703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782760703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1442122424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442122424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState_1993090424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993090424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiomeOnTop(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Z", cancellable = true)
    private void validBiomeOnTop__78047820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78047820L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__364346725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364346725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__738511652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738511652L))
            info.setReturnValue(null);
    }


}
