package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.StructureBlockEntity.class)
public class StructureBlockEntity_140958893Mixin {
        @Inject(at = @At("HEAD"), method = "isStrict()Z", cancellable = true)
    private void isStrict_662111664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662111664L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/block/state/properties/StructureMode;)V", cancellable = true)
    private void setMode__455782221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455782221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_707442636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707442636L))
            info.setReturnValue(-7623111806534247391L);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1324898060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1324898060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStrict(Z)V", cancellable = true)
    private void setStrict__1836563212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1836563212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror__945176590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945176590L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.LEFT_RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private void getMode__1737508579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737508579L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StructureMode.CORNER);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__392435497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392435497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__1981814977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981814977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__753726254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753726254L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "saveStructure(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;ZLjava/lang/String;ZLjava/util/List;)Z", cancellable = true)
    private static void saveStructure__333426028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333426028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveStructure(Z)Z", cancellable = true)
    private void saveStructure__1130259869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130259869L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveStructure()Z", cancellable = true)
    private void saveStructure_2038227885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038227885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStructureName()Ljava/lang/String;", cancellable = true)
    private void getStructureName_104031517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104031517L))
            info.setReturnValue("\uBA26y{\"J\"w\u6771#TG");
    }

    @Inject(at = @At("HEAD"), method = "placeStructure(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void placeStructure_2024845444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024845444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unloadStructure()V", cancellable = true)
    private void unloadStructure__467392853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-467392853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRandom(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void createRandom__1071986678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071986678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStructurePos_1527296694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527296694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStructurePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setStructurePos__1191136810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1191136810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMetaData()Ljava/lang/String;", cancellable = true)
    private void getMetaData__747358406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747358406L))
            info.setReturnValue("O]kx6^<FB\u14A93Vs,_P#6XGHkY\uC46D]O@%");
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_1169152262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169152262L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStructureSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getStructureSize__1056687094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056687094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntegrity()F", cancellable = true)
    private void getIntegrity_108199192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108199192L))
            info.setReturnValue(6.592315E8F);
    }

    @Inject(at = @At("HEAD"), method = "setStructureName(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setStructureName_696183307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696183307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStructureName(Ljava/lang/String;)V", cancellable = true)
    private void setStructureName__1494160755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494160755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadStructureInfo(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void loadStructureInfo__1988453735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988453735L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeStructureIfSameSize(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void placeStructureIfSameSize__1587472604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587472604L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setMetaData(Ljava/lang/String;)V", cancellable = true)
    private void setMetaData__214174088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-214174088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isStructureLoadable()Z", cancellable = true)
    private void isStructureLoadable__396831174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-396831174L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setShowBoundingBox(Z)V", cancellable = true)
    private void setShowBoundingBox__599530767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-599530767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIntegrity(F)V", cancellable = true)
    private void setIntegrity_70548000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(70548000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRotation(Lnet/minecraft/world/level/block/Rotation;)V", cancellable = true)
    private void setRotation_1076606162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1076606162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreEntities(Z)V", cancellable = true)
    private void setIgnoreEntities__1114168226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1114168226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStructureSize(Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void setStructureSize_1258440078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1258440078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShowBoundingBox()Z", cancellable = true)
    private void getShowBoundingBox_418718415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418718415L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBox()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private void getRenderableBox_542347775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542347775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasStructureName()Z", cancellable = true)
    private void hasStructureName_2011322047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011322047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered__1559029047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559029047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered__1798765685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1798765685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__437180987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437180987L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "createdBy(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void createdBy_5958958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(5958958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMirror(Lnet/minecraft/world/level/block/Mirror;)V", cancellable = true)
    private void setMirror__273655408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-273655408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderMode()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private void renderMode_1406940857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406940857L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.NONE);
    }

    @Inject(at = @At("HEAD"), method = "usedBy(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void usedBy__1560302230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560302230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "detectSize()Z", cancellable = true)
    private void detectSize_850373535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850373535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getShowAir()Z", cancellable = true)
    private void getShowAir_170015724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170015724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setShowAir(Z)V", cancellable = true)
    private void setShowAir__746741388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-746741388L))
            info.cancel();
    }


}
