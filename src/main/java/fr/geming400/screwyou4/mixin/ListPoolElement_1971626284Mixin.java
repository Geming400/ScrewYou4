package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.ListPoolElement.class)
public class ListPoolElement_1971626284Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_836165812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836165812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType__1700140243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700140243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_1021708268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021708268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getElements()Ljava/util/List;", cancellable = true)
    private void getElements__697004197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697004197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_393680354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393680354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1932430266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932430266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProjection(Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;)Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void setProjection__1885025095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885025095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_1338495318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338495318L))
            info.setReturnValue(null);
    }


}
