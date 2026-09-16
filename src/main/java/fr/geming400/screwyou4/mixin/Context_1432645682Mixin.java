package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier.Context.class)
public class Context_1432645682Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_524019413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524019413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2091898090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091898090L))
            info.setReturnValue("q8G;\u9303|yW#M+J;bwmgJ\uFB363\uD5F2YcKai\u4EB8EG\u5F54daLe!nd2R#01jO]F%\uA4FC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1989997772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989997772L))
            info.setReturnValue(14948380);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_2008734215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008734215L))
            info.setReturnValue(3063065356161154020L);
    }

    @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config__269429361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269429361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos__432975997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432975997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_377752471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377752471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor__2133579503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133579503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__1051161594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051161594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeSource()Lnet/minecraft/world/level/biome/BiomeSource;", cancellable = true)
    private void biomeSource__1612149846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612149846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiome()Ljava/util/function/Predicate;", cancellable = true)
    private void validBiome_248971267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248971267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiomeOnTop(Lnet/minecraft/world/level/levelgen/Heightmap$Types;)Z", cancellable = true)
    private void validBiomeOnTop__1051052382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051052382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__266666367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266666367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__1447137092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447137092L))
            info.setReturnValue(null);
    }


}
