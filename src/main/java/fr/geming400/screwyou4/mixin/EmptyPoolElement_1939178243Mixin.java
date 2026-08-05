package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.EmptyPoolElement.class)
public class EmptyPoolElement_1939178243Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_803717771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803717771L))
            info.setReturnValue("gog1U]` 1_6fR}p?xio\uC35EN\u493F");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType__1732588284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732588284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_989260227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989260227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_361232313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361232313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1899982225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899982225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_1306047277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306047277L))
            info.setReturnValue(null);
    }


}
