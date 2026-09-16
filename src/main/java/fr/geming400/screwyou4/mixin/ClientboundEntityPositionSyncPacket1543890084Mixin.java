package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket.class)
public class ClientboundEntityPositionSyncPacket1543890084Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1699757674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699757674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_635263816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635263816L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1980653687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980653687L))
            info.setReturnValue("\uFD9FhA7{\uFAB1c)-d{:\u7DE2J{\u2D58c>?]-u[\u16BD\"6s\u313D\u1769L5;V_c6oF!ak9GP}XwZb\u0207>#\u79E91WN_z+c5X\u1EE6Zta:39laWv4x\uFC4E");
    }

    @Inject(at = @At("HEAD"), method = "values()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void values__1949987373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949987373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2101242175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101242175L))
            info.setReturnValue(-1503495018);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ClientboundEntityPositionSyncPacket;", cancellable = true)
    private static void of_1825373609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825373609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1151293873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151293873L))
            info.setReturnValue(-1707528895);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__47587510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47587510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1248178221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1248178221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround_1421641173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421641173L))
            info.setReturnValue(false);
    }


}
