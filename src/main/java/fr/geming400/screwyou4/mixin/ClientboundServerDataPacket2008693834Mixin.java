package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundServerDataPacket.class)
public class ClientboundServerDataPacket2008693834Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2130405872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130405872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1100067566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100067566L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1515849937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515849937L))
            info.setReturnValue("sFX,\u758B:H7\uBD0A\uA4A0Zy4<jvO&\u4674&/\uCC92t=\u3A7CJ\uCBD5\uB7EE\uCA18\u936DAL1\u2794'[c%doX}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1728921371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728921371L))
            info.setReturnValue(1773439880);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1712981971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712981971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_417216240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(417216240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "iconBytes()Ljava/util/Optional;", cancellable = true)
    private void iconBytes__1204654230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204654230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "motd()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void motd__633085457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633085457L))
            info.setReturnValue(null);
    }


}
