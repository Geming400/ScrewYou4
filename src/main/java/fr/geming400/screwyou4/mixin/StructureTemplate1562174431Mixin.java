package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.class)
public class StructureTemplate1562174431Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void load_1622047385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1622047385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void transform__1745782989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745782989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transform(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void transform__1772679245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772679245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void save__47920030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47920030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__578394292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578394292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_1177775967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177775967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZeroPositionWithTransform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getZeroPositionWithTransform_1074024185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074024185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZeroPositionWithTransform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;II)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getZeroPositionWithTransform_285830353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285830353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processBlockInfos(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void processBlockInfos__1572812714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572812714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJointType(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void getJointType__1198668854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198668854L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }

    @Inject(at = @At("HEAD"), method = "calculateConnectedPosition(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void calculateConnectedPosition__987949248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987949248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillFromWorld(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;ZLjava/util/List;)V", cancellable = true)
    private void fillFromWorld_888953031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(888953031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeInWorld(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/util/RandomSource;I)Z", cancellable = true)
    private void placeInWorld__1565965233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565965233L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultJointType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void getDefaultJointType__67593227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67593227L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__2134397782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134397782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_1824001866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824001866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private void filterBlocks_525464816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525464816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/world/level/block/Block;Z)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void filterBlocks_2081349286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081349286L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "calculateRelativePosition(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void calculateRelativePosition__1676631625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676631625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShapeAtEdge(Lnet/minecraft/world/level/LevelAccessor;ILnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void updateShapeAtEdge_2114572547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2114572547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateShapeAtEdge(Lnet/minecraft/world/level/LevelAccessor;ILnet/minecraft/world/phys/shapes/DiscreteVoxelShape;III)V", cancellable = true)
    private static void updateShapeAtEdge__1356520248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1356520248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAuthor(Ljava/lang/String;)V", cancellable = true)
    private void setAuthor__1580431716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1580431716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAuthor()Ljava/lang/String;", cancellable = true)
    private void getAuthor_426713960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426713960L))
            info.setReturnValue("G㟹e");
    }

    @Inject(at = @At("HEAD"), method = "getJigsaws(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Ljava/util/List;", cancellable = true)
    private void getJigsaws_1605566184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605566184L))
            info.setReturnValue(null);
    }


}
