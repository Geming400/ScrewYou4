package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement.class)
public class SinglePoolElement1816141418Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1708402849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708402849L))
            info.setReturnValue("9aF(KV)H\u9D7E]\uBDB5b#DN]-:'P#;Z#\u0C94Fh,ieR7%<2!D\u82C6J0\uFE54\uFFB6Z98");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType_1608337084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608337084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_1930654562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930654562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplateLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTemplateLocation_1980765814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980765814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataMarkers(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Z)Ljava/util/List;", cancellable = true)
    private void getDataMarkers__1659058716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659058716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__563068408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563068408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_258319869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258319869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_506279336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506279336L))
            info.setReturnValue(false);
    }


}
