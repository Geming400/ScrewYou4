package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.GenerationContext.class)
public class GenerationContext1280460080Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1628994957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628994957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_145000105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145000105L))
            info.setReturnValue("V脇@RCHnD3mymi KX\",gUỏ0锻^赐OW'0>译IBX峴ᓈ◐,椮qKpm&z'씪d`a%EqJ竾:sn틾 E-饃o=㘛镚+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1318722822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318722822L))
            info.setReturnValue(1576495767);
    }

    @Inject(at = @At("HEAD"), method = "seed()J", cancellable = true)
    private void seed_1318723287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318723287L))
            info.setReturnValue(3974986971548088793L);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/world/level/levelgen/WorldgenRandom;", cancellable = true)
    private void random__304376436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304376436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void chunkPos_391361243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391361243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validBiome()Ljava/util/function/Predicate;", cancellable = true)
    private void validBiome_630575102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630575102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightAccessor()Lnet/minecraft/world/level/LevelHeightAccessor;", cancellable = true)
    private void heightAccessor_1317680478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317680478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState_1840904823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840904823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1289936823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289936823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeSource()Lnet/minecraft/world/level/biome/BiomeSource;", cancellable = true)
    private void biomeSource__1270380508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270380508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator__516532326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516532326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureTemplateManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureTemplateManager__890697253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-890697253L))
            info.setReturnValue(null);
    }


}
