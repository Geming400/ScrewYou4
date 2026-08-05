package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket.class)
public class ClientboundEntityPositionSyncPacket1543890084Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__135135004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135135004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1365564953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365564953L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_408430109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408430109L))
            info.setReturnValue("HsKY㈘fI{b1]/z=JbmK?&B6265+/yYONY");
    }

    @Inject(at = @At("HEAD"), method = "values()Lnet/minecraft/world/entity/PositionMoveRotation;", cancellable = true)
    private void values_20724149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20724149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1582152826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582152826L))
            info.setReturnValue(1280008200);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ClientboundEntityPositionSyncPacket;", cancellable = true)
    private static void of__1942695470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942695470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1582152330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582152330L))
            info.setReturnValue(1557027408);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1741397618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741397618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2073008299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2073008299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround_1582168667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582168667L))
            info.setReturnValue(true);
    }


}
