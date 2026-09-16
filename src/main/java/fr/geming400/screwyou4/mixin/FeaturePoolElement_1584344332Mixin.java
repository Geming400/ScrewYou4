package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.FeaturePoolElement.class)
public class FeaturePoolElement_1584344332Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1940199936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940199936L))
            info.setReturnValue("yBu\uC176pi\u2191^]_hT% <{z;8^%.+K%^,\u8E11Z0\u522E\u6C91H\uFD5A8J4\uAD24AaB-TkP3}I<4Z@A711\"0\">)'w+\u97E3\u65D9\uBE31K\uF9485nW<@)\u6AD6\u8BCAFd");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType_1376539997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376539997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_1698857475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698857475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/templatesystem/LiquidSettings;Z)Z", cancellable = true)
    private void place_274482249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274482249L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getShuffledJigsawBlocks(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private void getShuffledJigsawBlocks_26522782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26522782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__794865495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794865495L))
            info.setReturnValue(null);
    }


}
