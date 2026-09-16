package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.class)
public class TestInstanceBlockEntity_27655397Mixin {
        @Inject(at = @At("HEAD"), method = "test()Ljava/util/Optional;", cancellable = true)
    private void test__2038588124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038588124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;)V", cancellable = true)
    private void set__332485411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-332485411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__536287589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536287589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)Z", cancellable = true)
    private static void export_1915769528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915769528L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__505738993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505738993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__2095118473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095118473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeamSections()Ljava/util/List;", cancellable = true)
    private void getBeamSections_1741552903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741552903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__867029750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867029750L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_269381233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269381233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreEntities()Z", cancellable = true)
    private void ignoreEntities__1144311096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144311096L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeStructure()Z", cancellable = true)
    private void placeStructure_1333141999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333141999L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStructurePos_1413993198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413993198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getStructurePos__963768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureSize(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void getStructureSize_635667897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635667897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBox()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private void getRenderableBox_429044279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429044279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getStructureBounds_1088133386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088133386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getStructureBoundingBox__1494166088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494166088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeBarriers()V", cancellable = true)
    private void removeBarriers_1927364439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1927364439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStartCorner()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartCorner_1512006244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512006244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getTestBoundingBox__1299282995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299282995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getTestBounds__414262497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414262497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTestName__584743574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584743574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processStructureBoundary(Ljava/util/function/Consumer;)V", cancellable = true)
    private void processStructureBoundary_1317157327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317157327L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setErrorMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setErrorMessage_2102165418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2102165418L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearErrorMarkers()V", cancellable = true)
    private void clearErrorMarkers_1484913433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1484913433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encaseStructure()V", cancellable = true)
    private void encaseStructure_1190645181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1190645181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getErrorMarkers()Ljava/util/List;", cancellable = true)
    private void getErrorMarkers_1477784667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477784667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__1407992091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407992091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__550484483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550484483L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "renderMode()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private void renderMode_1293637361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293637361L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.BOX);
    }

    @Inject(at = @At("HEAD"), method = "setRunning()V", cancellable = true)
    private void setRunning__942851398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-942851398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTest(Ljava/util/function/Consumer;)V", cancellable = true)
    private void resetTest_1316040578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1316040578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exportTest(Ljava/util/function/Consumer;)Z", cancellable = true)
    private void exportTest_547176747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547176747L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "runTest(Ljava/util/function/Consumer;)V", cancellable = true)
    private void runTest_2073624510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2073624510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markError(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void markError_937149370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937149370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveTest(Ljava/util/function/Consumer;)Ljava/util/Optional;", cancellable = true)
    private void saveTest__1509871527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509871527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSuccess()V", cancellable = true)
    private void setSuccess_1859836662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1859836662L))
            info.cancel();
    }


}
