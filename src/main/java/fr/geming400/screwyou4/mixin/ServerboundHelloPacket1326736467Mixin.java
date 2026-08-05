package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundHelloPacket.class)
public class ServerboundHelloPacket1326736467Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_191275996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191275996L))
            info.setReturnValue(")㚍{Ji*.ＪbP嗵X");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__352288621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352288621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1582718570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582718570L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_191276492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191276492L))
            info.setReturnValue("nV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364999209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364999209L))
            info.setReturnValue(1237866234);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle__535138949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-535138949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2004805380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2004805380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_1737870950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737870950L))
            info.setReturnValue(null);
    }


}
