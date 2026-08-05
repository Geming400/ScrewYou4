package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetJigsawBlockPacket.class)
public class ServerboundSetJigsawBlockPacket_221660897Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName_2073561639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073561639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1457364192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457364192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPool()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getPool_2073561639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073561639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1646961098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1646961098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_899729809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(899729809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTarget_2073561639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073561639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementPriority()I", cancellable = true)
    private void getPlacementPriority_259923142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259923142L))
            info.setReturnValue(-517712646);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPriority()I", cancellable = true)
    private void getSelectionPriority_259923142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259923142L))
            info.setReturnValue(-517712646);
    }

    @Inject(at = @At("HEAD"), method = "getFinalState()Ljava/lang/String;", cancellable = true)
    private void getFinalState__913799575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913799575L))
            info.setReturnValue("f/$}풇.BO@<)pa*IB/kK至");
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1671725983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671725983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJoint()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void getJoint_1698530189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698530189L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ALIGNED);
    }


}
