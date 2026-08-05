package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestInstanceBlockEntity.class)
public class TestInstanceBlockEntity_27655397Mixin {
        @Inject(at = @At("HEAD"), method = "test()Ljava/util/Optional;", cancellable = true)
    private void test_273116818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273116818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;)V", cancellable = true)
    private void set_291214075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(291214075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__356743068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356743068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/Identifier;Ljava/util/function/Consumer;)Z", cancellable = true)
    private static void export__80922108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80922108L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__1470665962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470665962L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "errorMessage()Ljava/util/Optional;", cancellable = true)
    private void errorMessage_273116818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273116818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeamSections()Ljava/util/List;", cancellable = true)
    private void getBeamSections_1653992212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653992212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderMode()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private void renderMode_61745514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61745514L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.BOX);
    }

    @Inject(at = @At("HEAD"), method = "saveTest(Ljava/util/function/Consumer;)Ljava/util/Optional;", cancellable = true)
    private void saveTest_436876456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436876456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markError(Lnet/minecraft/core/BlockPos;Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void markError_593785727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(593785727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exportTest(Ljava/util/function/Consumer;)Z", cancellable = true)
    private void exportTest_708675653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708675653L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSuccess()V", cancellable = true)
    private void setSuccess_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRunning()V", cancellable = true)
    private void setRunning_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runTest(Ljava/util/function/Consumer;)V", cancellable = true)
    private void runTest_708671809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708671809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTest(Ljava/util/function/Consumer;)V", cancellable = true)
    private void resetTest_708671809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708671809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getTestBoundingBox_197803182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197803182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTestBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getTestBounds__1393001956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393001956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setErrorMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setErrorMessage__1873523541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1873523541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encaseStructure()V", cancellable = true)
    private void encaseStructure_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getErrorMarkers()Ljava/util/List;", cancellable = true)
    private void getErrorMarkers_1653992212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653992212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartCorner()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStartCorner__1865731483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865731483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processStructureBoundary(Ljava/util/function/Consumer;)V", cancellable = true)
    private void processStructureBoundary_708671809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708671809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__1138966152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138966152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__986897666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986897666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__969196376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969196376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeStructure()Z", cancellable = true)
    private void placeStructure_65933979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65933979L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ignoreEntities()Z", cancellable = true)
    private void ignoreEntities_65933979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65933979L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStructureSize(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void getStructureSize__1739792553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739792553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBox()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private void getRenderableBox__1739447246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739447246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getStructurePos_2051150641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051150641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStructurePos__1865731483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865731483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureBoundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void getStructureBoundingBox_197803182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(197803182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearErrorMarkers()V", cancellable = true)
    private void clearErrorMarkers_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStructureBounds()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getStructureBounds__1393001956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393001956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeBarriers()V", cancellable = true)
    private void removeBarriers_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTestName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTestName_2145713527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145713527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_65930135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65930135L))
            info.cancel();
    }


}
