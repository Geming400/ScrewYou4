package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket.class)
public class ClientboundSetTitleTextPacket1066394464Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1222262054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222262054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_157768196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157768196L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1836817989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1836817989L))
            info.setReturnValue("Pa|>h8lO$>\u3F20FF3kTV1wD=Bg0$Qi:@S}2Czn1G.7/+Ux@|\u0306M\uC711@J}S\uD3FFSu,o_x5.5=g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1623746555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623746555L))
            info.setReturnValue(-1124908077);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_770682601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(770682601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__525083130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-525083130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text_165634272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165634272L))
            info.setReturnValue(null);
    }


}
