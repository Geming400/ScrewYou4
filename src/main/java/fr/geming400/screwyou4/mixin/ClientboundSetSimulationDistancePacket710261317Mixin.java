package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetSimulationDistancePacket.class)
public class ClientboundSetSimulationDistancePacket710261317Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__968763771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968763771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2095773576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095773576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__425198658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425198658L))
            info.setReturnValue("&:Y$6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_748524059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748524059L))
            info.setReturnValue(-2029737152);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_907768851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(907768851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1388330230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1388330230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()I", cancellable = true)
    private void simulationDistance_748523563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748523563L))
            info.setReturnValue(-1851213662);
    }


}
