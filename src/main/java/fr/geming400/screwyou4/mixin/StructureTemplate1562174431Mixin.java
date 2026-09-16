package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.class)
public class StructureTemplate1562174431Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void load_592250227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(592250227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transform(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void transform_1336203719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336203719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void transform__801150137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801150137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void save__941639009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941639009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__1148448573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148448573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize_998231446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998231446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox__300826567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300826567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getBoundingBox_159201883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159201883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeInWorld(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/util/RandomSource;I)Z", cancellable = true)
    private void placeInWorld_1540448181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1540448181L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillFromWorld(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;ZLjava/util/List;)V", cancellable = true)
    private void fillFromWorld__96937012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-96937012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultJointType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void getDefaultJointType__771312690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771312690L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }

    @Inject(at = @At("HEAD"), method = "getZeroPositionWithTransform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getZeroPositionWithTransform_1259029272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259029272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZeroPositionWithTransform(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Mirror;Lnet/minecraft/world/level/block/Rotation;II)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getZeroPositionWithTransform_1982059824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982059824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAuthor(Ljava/lang/String;)V", cancellable = true)
    private void setAuthor_755482479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(755482479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAuthor()Ljava/lang/String;", cancellable = true)
    private void getAuthor__1352228567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352228567L))
            info.setReturnValue("e#yK\u56DEm8N1]\u79CFFAclu$^A\u8B87;\uABB6,*\u14A3\uFE4E={\u67F4nGfC.e!gIU5I1Jkh0b(sE%<sYP&wa\u9C5DC}\uD7F4/nP?nU\uB0AD\uFF60Q\u9BF77@kf\u8123\u7B67U\u84ADf99");
    }

    @Inject(at = @At("HEAD"), method = "calculateConnectedPosition(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void calculateConnectedPosition__1205784780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205784780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJigsaws(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;)Ljava/util/List;", cancellable = true)
    private void getJigsaws__1718870804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718870804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShapeAtEdge(Lnet/minecraft/world/level/LevelAccessor;ILnet/minecraft/world/phys/shapes/DiscreteVoxelShape;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void updateShapeAtEdge__131435509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-131435509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateShapeAtEdge(Lnet/minecraft/world/level/LevelAccessor;ILnet/minecraft/world/phys/shapes/DiscreteVoxelShape;III)V", cancellable = true)
    private static void updateShapeAtEdge__1977122352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1977122352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "filterBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private void filterBlocks__1539675378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539675378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/world/level/block/Block;Z)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void filterBlocks__1863885628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863885628L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "calculateRelativePosition(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void calculateRelativePosition__139556718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139556718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processBlockInfos(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void processBlockInfos__1555948433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555948433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJointType(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private static void getJointType__458183844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458183844L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ROLLABLE);
    }


}
