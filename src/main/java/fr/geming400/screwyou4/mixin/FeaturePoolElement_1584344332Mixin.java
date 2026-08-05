package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.FeaturePoolElement.class)
public class FeaturePoolElement_1584344332Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_448883860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448883860L))
            info.setReturnValue("mU)=?% Hd&|5?/]K[fn2iapnW&X66.|ꫲOs");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType__2087422195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087422195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_634426316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634426316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_6398402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(6398402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_951213366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951213366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1545148314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545148314L))
            info.setReturnValue(null);
    }


}
