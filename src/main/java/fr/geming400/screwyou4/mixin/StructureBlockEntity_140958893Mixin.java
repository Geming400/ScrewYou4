package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.StructureBlockEntity.class)
public class StructureBlockEntity_140958893Mixin {
        @Inject(at = @At("HEAD"), method = "isStrict()Z", cancellable = true)
    private void isStrict_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/block/state/properties/StructureMode;)V", cancellable = true)
    private void setMode_1257448120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257448120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_179222099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179222099L))
            info.setReturnValue(-63981153232847549L);
    }

    @Inject(at = @At("HEAD"), method = "setSeed(J)V", cancellable = true)
    private void setSeed_1355799385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355799385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStrict(Z)V", cancellable = true)
    private void setStrict_1370575721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370575721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror_1896393917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896393917L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.LEFT_RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private void getMode_270996356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270996356L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StructureMode.CORNER);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__1357362466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357362466L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_180);
    }

    @Inject(at = @At("HEAD"), method = "renderMode()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$Mode;", cancellable = true)
    private void renderMode_175049010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175049010L))
            info.setReturnValue(net.minecraft.world.level.block.entity.BoundingBoxRenderable.Mode.NONE);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered_1370575721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370575721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__1025662656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025662656L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket__855892880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855892880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__873594170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873594170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntegrity()F", cancellable = true)
    private void getIntegrity_179218255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179218255L))
            info.setReturnValue(5.580768E8F);
    }

    @Inject(at = @At("HEAD"), method = "setRotation(Lnet/minecraft/world/level/block/Rotation;)V", cancellable = true)
    private void setRotation_1236345554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1236345554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStructureName()Ljava/lang/String;", cancellable = true)
    private void getStructureName__994501579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994501579L))
            info.setReturnValue("a%Ou#5BQ}sBFqB_mT.b\u8E2F@Y8povE0-T3Z9K\u39DFdh*Ow\uCBABH\uB5ECd\uD216dNJWh\u72DCtWH0t}\uC643z:P\uCF2FG- fovnD\u147A\u16D2R)bl8E^\".@cz>M!");
    }

    @Inject(at = @At("HEAD"), method = "placeStructure(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void placeStructure__837450448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-837450448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreEntities(Z)V", cancellable = true)
    private void setIgnoreEntities_1370575721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370575721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMetaData()Ljava/lang/String;", cancellable = true)
    private void getMetaData__994501579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994501579L))
            info.setReturnValue("a%Ou#5BQ}sBFqB_mT.b\u8E2F@Y8povE0-T3Z9K\u39DFdh*Ow\uCBABH\uB5ECd\uD216dNJWh\u72DCtWH0t}\uC643z:P\uCF2FG- fovnD\u147A\u16D2R)bl8E^\".@cz>M!");
    }

    @Inject(at = @At("HEAD"), method = "setStructureName(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setStructureName__1353482265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1353482265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setStructureName(Ljava/lang/String;)V", cancellable = true)
    private void setStructureName_1293320041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293320041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStructureSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getStructureSize__243439572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243439572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStructurePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setStructurePos_309725491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(309725491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRandom(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private static void createRandom_1601086059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601086059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStructureSize(Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void setStructureSize__1477127520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477127520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIntegrity(F)V", cancellable = true)
    private void setIntegrity_1352105301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352105301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeStructureIfSameSize(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void placeStructureIfSameSize__837446604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837446604L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMetaData(Ljava/lang/String;)V", cancellable = true)
    private void setMetaData_1293320041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293320041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShowBoundingBox()Z", cancellable = true)
    private void getShowBoundingBox_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setShowBoundingBox(Z)V", cancellable = true)
    private void setShowBoundingBox_1370575721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370575721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveStructure()Z", cancellable = true)
    private void saveStructure_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveStructure(Z)Z", cancellable = true)
    private void saveStructure_1370579565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370579565L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveStructure(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;ZLjava/lang/String;ZLjava/util/List;)Z", cancellable = true)
    private static void saveStructure__149871842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149871842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBox()Lnet/minecraft/world/level/block/entity/BoundingBoxRenderable$RenderableBox;", cancellable = true)
    private void getRenderableBox__1626143750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626143750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unloadStructure()V", cancellable = true)
    private void unloadStructure_179233631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179233631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadStructureInfo(Lnet/minecraft/server/level/ServerLevel;)Z", cancellable = true)
    private void loadStructureInfo__837446604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837446604L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStructurePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getStructurePos__1752427987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752427987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasStructureName()Z", cancellable = true)
    private void hasStructureName_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isStructureLoadable()Z", cancellable = true)
    private void isStructureLoadable_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "detectSize()Z", cancellable = true)
    private void detectSize_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getShowAir()Z", cancellable = true)
    private void getShowAir_179237475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179237475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setShowAir(Z)V", cancellable = true)
    private void setShowAir_1370575721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370575721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "usedBy(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void usedBy_1081564382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081564382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createdBy(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void createdBy_462622223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(462622223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMirror(Lnet/minecraft/world/level/block/Mirror;)V", cancellable = true)
    private void setMirror_954537649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(954537649L))
            info.cancel();
    }


}
