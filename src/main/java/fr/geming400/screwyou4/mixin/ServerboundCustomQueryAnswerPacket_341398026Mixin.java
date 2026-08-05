package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundCustomQueryAnswerPacket.class)
public class ServerboundCustomQueryAnswerPacket_341398026Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Lnet/minecraft/network/protocol/login/custom/CustomQueryAnswerPayload;", cancellable = true)
    private void payload__1637056632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637056632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1337627063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337627063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1726910284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726910284L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__794061950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794061950L))
            info.setReturnValue("Vw}&䁤`$yాF㎚&7&鏚-La14dL>fK赇E★g짱u)M䯎w져ℭB/@mrT:㡕`H|6+2$E'2YsᮯD5묁jKs*!Tz!ሹ|鑓]嬼'*AMU*ⵍg}o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_379660767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379660767L))
            info.setReturnValue(1822122831);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle__1520477391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1520477391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1019466938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1019466938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transactionId()I", cancellable = true)
    private void transactionId_379660271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379660271L))
            info.setReturnValue(424714826);
    }


}
