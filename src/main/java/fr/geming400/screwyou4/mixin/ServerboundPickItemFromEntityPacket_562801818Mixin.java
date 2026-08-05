package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPickItemFromEntityPacket.class)
public class ServerboundPickItemFromEntityPacket_562801818Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1116223271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116223271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1948314076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948314076L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__572658158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572658158L))
            info.setReturnValue(">郜ꎚbVꚊ{s0獔&%+$ሣ 䲵R姥CN{Fuda9wBs'롚VHL5)KMC.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_601064559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601064559L))
            info.setReturnValue(-574110082);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_601064063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601064063L))
            info.setReturnValue(-370962663);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1240870730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240870730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1305820177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1305820177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeData()Z", cancellable = true)
    private void includeData_601080400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601080400L))
            info.setReturnValue(false);
    }


}
