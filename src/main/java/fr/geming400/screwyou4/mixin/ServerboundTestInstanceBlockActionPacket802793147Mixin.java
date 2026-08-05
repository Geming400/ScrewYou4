package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.class)
public class ServerboundTestInstanceBlockActionPacket802793147Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__876231941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876231941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2106661890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106661890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__332666828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332666828L))
            info.setReturnValue("*KciA1X;\uC8F0M`4@DtV@e \uFEF2p DO7/\u0BB2cubrd\u72822tm3XwMx]f\"v\uFDC3I\uBCF9V0 2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_841055889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841055889L))
            info.setReturnValue(3300208);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void data__174876980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174876980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket$Action;", cancellable = true)
    private void action__2113834999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113834999L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.Action.RESET);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1090593732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090593732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1480862060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480862060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1065828847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1065828847L))
            info.cancel();
    }


}
