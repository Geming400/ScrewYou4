package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTabListPacket.class)
public class ClientboundTabListPacket1891381434Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_212356346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212356346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1018073603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018073603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_755921459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755921459L))
            info.setReturnValue("F\u5D7EO,W+erM9g2Zr9_z\u5D4FW0\"n00`\u41EFJ+S\u9679:A\u1760[>>y\uFBB5G3k{\u31CF-E\u67BF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1929644176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929644176L))
            info.setReturnValue(657533329);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1725516949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1725516949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2088888968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2088888968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "header()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void header__285527731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-285527731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "footer()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void footer__285527731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-285527731L))
            info.setReturnValue(null);
    }


}
