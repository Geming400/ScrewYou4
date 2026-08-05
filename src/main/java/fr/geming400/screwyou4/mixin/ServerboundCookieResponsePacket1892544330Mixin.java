package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.cookie.ServerboundCookieResponsePacket.class)
public class ServerboundCookieResponsePacket1892544330Mixin {
        @Inject(at = @At("HEAD"), method = "payload()[B", cancellable = true)
    private void payload__1216588336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216588336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_213519242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213519242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1016910707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016910707L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_757084355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757084355L))
            info.setReturnValue("-V&;\uD172ZNF_BX.C/8\u9959h\uA467?&Kr!/i|\u2743\u2AAC\u8C65`9_![wyH](b*\u4D9A[ q77g\"l}#p9,$z\u9BE7^l,Ix\u3BE9VK#{\u542C\u8F46");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1930807072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930807072L))
            info.setReturnValue(1615856514);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void key__550522223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550522223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1724354053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1724354053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/cookie/ServerCookiePacketListener;)V", cancellable = true)
    private void handle_608605792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(608605792L))
            info.cancel();
    }


}
