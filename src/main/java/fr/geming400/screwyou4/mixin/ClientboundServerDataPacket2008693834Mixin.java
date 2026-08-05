package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundServerDataPacket.class)
public class ClientboundServerDataPacket2008693834Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_329668746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329668746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__900761203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900761203L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_873233859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873233859L))
            info.setReturnValue("@M\uACB6gfy'Z\u047D\uB494F\u2227TQ4_V\uD4F6\u86D3Z2)\u3D57|fNYj1@gbKj@b)\uFC5F*_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2046956576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046956576L))
            info.setReturnValue(860453266);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1608204549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1608204549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2088765928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2088765928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "motd()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void motd__168215331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168215331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iconBytes()Ljava/util/Optional;", cancellable = true)
    private void iconBytes__2040812040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040812040L))
            info.setReturnValue(null);
    }


}
