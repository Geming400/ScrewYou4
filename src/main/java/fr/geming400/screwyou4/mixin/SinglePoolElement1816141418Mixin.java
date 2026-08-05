package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement.class)
public class SinglePoolElement1816141418Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_680680947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680680947L))
            info.setReturnValue("h &mHjNU,_zWlpf&phY4L&.^I8b+5I\u3845T\u4884-}'\u8F6FT[W6{Egf62a6\u786D\u430Ai''DxO'7KyNc4aa9u9WN&6\uC5F0jTy\u2071>L\uB4DE>\u6A8EU\u3505Yr#\u230AqCv");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType__1855625108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855625108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_866223403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866223403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_238195489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238195489L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1776945401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776945401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTemplateLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTemplateLocation__626925135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626925135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataMarkers(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Z)Ljava/util/List;", cancellable = true)
    private void getDataMarkers_2133501675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133501675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_1183010453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183010453L))
            info.setReturnValue(null);
    }


}
