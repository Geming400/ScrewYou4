package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundStoreCookiePacket.class)
public class ClientboundStoreCookiePacket_1945236710Mixin {
        @Inject(at = @At("HEAD"), method = "payload()[B", cancellable = true)
    private void payload__1119593863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119593863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2101104299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101104299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1036610441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036610441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1579307062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579307062L))
            info.setReturnValue(".kD9QT\u64E59<\uCF99xg-o-ldJF[T@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1792378496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792378496L))
            info.setReturnValue(432546881);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key_391072651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391072651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1649524846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649524846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_1695180267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695180267L))
            info.cancel();
    }


}
