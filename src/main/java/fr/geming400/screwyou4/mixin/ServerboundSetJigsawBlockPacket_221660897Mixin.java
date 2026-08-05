package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetJigsawBlockPacket.class)
public class ServerboundSetJigsawBlockPacket_221660897Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getName__539224024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539224024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_377528486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377528486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPool()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getPool__697003847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697003847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_859021070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859021070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__74050967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-74050967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTarget_1954565038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954565038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJoint()Lnet/minecraft/world/level/block/entity/JigsawBlockEntity$JointType;", cancellable = true)
    private void getJoint_2114076257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114076257L))
            info.setReturnValue(net.minecraft.world.level.block.entity.JigsawBlockEntity.JointType.ALIGNED);
    }

    @Inject(at = @At("HEAD"), method = "getPlacementPriority()I", cancellable = true)
    private void getPlacementPriority_655767987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655767987L))
            info.setReturnValue(-326330394);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPriority()I", cancellable = true)
    private void getSelectionPriority_842211948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842211948L))
            info.setReturnValue(-1102556521);
    }

    @Inject(at = @At("HEAD"), method = "getFinalState()Ljava/lang/String;", cancellable = true)
    private void getFinalState__1599160230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599160230L))
            info.setReturnValue("{R:vc1O9c$+]X\u37C5{H)ydY");
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_711226627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711226627L))
            info.setReturnValue(null);
    }


}
