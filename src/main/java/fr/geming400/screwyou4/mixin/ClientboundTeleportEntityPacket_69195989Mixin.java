package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket.class)
public class ClientboundTeleportEntityPacket_69195989Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1609829100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609829100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1454708247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454708247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1066263987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066263987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_107458730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107458730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_107458234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107458234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_266703522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(266703522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_747264901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747264901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "change()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void change__1453969947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1453969947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround_107474571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107474571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(ILnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;Z)Lnet/minecraft/network/protocol/game/ClientboundTeleportEntityPacket;", cancellable = true)
    private static void teleport__2005165374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005165374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relatives()Ljava/util/Set;", cancellable = true)
    private void relatives__1759839498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759839498L))
            info.setReturnValue(null);
    }


}
