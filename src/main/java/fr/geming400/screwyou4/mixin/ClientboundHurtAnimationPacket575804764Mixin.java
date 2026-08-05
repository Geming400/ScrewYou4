package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundHurtAnimationPacket.class)
public class ClientboundHurtAnimationPacket575804764Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1103220324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103220324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1961317023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961317023L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__559655211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559655211L))
            info.setReturnValue("T葐1-!^Q)kJJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_614067506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614067506L))
            info.setReturnValue(788665649);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_614067010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614067010L))
            info.setReturnValue(967189138);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_773312298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(773312298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1253873677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253873677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_614064127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614064127L))
            info.setReturnValue(8.19162E8F);
    }


}
