package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetStructureBlockPacket.class)
public class ServerboundSetStructureBlockPacket302360811Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__833099660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833099660L))
            info.setReturnValue("^?C6Z'eKV0!xY\uBC5Az@TFzY^i;KI8\u5536E\uC25A2Z`^S!$)8|\u12381m?!Hs4vh5lg\u6846IE\u3A71W\u4365\u4040x");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1376664277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376664277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getSize__82037653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82037653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1566261183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1566261183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_980429724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(980429724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOffset()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getOffset__1591026068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1591026068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStrict()Z", cancellable = true)
    private void isStrict_340639394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340639394L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_340624018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340624018L))
            info.setReturnValue(-1018512218033239422L);
    }

    @Inject(at = @At("HEAD"), method = "getData()Ljava/lang/String;", cancellable = true)
    private void getData__833099660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833099660L))
            info.setReturnValue("^?C6Z'eKV0!xY\uBC5Az@TFzY^i;KI8\u5536E\uC25A2Z`^S!$)8|\u12381m?!Hs4vh5lg\u6846IE\u3A71W\u4365\u4040x");
    }

    @Inject(at = @At("HEAD"), method = "getMirror()Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private void getMirror_2057795836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057795836L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.FRONT_BACK);
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private void getMode_432398275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432398275L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StructureMode.CORNER);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__1195960547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195960547L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1591026068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1591026068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntegrity()F", cancellable = true)
    private void getIntegrity_340620174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340620174L))
            info.setReturnValue(4.660676E8F);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoreEntities()Z", cancellable = true)
    private void isIgnoreEntities_340639394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340639394L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateType()Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private void getUpdateType__1415026851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415026851L))
            info.setReturnValue(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.UPDATE_DATA);
    }

    @Inject(at = @At("HEAD"), method = "isShowBoundingBox()Z", cancellable = true)
    private void isShowBoundingBox_340639394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340639394L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isShowAir()Z", cancellable = true)
    private void isShowAir_340639394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340639394L))
            info.setReturnValue(true);
    }


}
