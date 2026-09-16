package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundDisconnectPacket.class)
public class ClientboundDisconnectPacket1691042233Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1846909823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846909823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_782415965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782415965L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1833501538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833501538L))
            info.setReturnValue("[I:5hi<u\u845D&\u2FAA\u3944ys}jd?)@G6\uB96C\u11C9L<*uZnQ^KZ\u5EE3$x7^9N7)\uCB3E\"\u687E-y :K]\u8A41zas4^\uB672SM$R:S;8>K7S\u55FBjdm\u74CC\uB064ld\uA49DOR)$u`aO';Hd`W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2046572972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046572972L))
            info.setReturnValue(426761115);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void reason__1147486320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1147486320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1395330370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1395330370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_1440985791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1440985791L))
            info.cancel();
    }


}
