package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundClientInformationPacket.class)
public class ServerboundClientInformationPacket2029719886Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_350694798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350694798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__879735151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879735151L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_894259911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894259911L))
            info.setReturnValue("TM)meHJ5*[>}c2BpUm[-\uC3F6+yz\u073E=\uD14879&a\uCE24[1RNq\"\"\u40A3}N\u9F08JkqFVrY\uFD5Do3XGVZQ@VH\"\uCD01WT\uCB33/=,<1\uA679Q`H/Ab1\u46EB\u747Ey");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2067982628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067982628L))
            info.setReturnValue(660706340);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__706115324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-706115324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1587178497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587178497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "information()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void information_1097830206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097830206L))
            info.setReturnValue(null);
    }


}
