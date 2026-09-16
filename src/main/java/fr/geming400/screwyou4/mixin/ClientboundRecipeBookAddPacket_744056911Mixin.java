package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookAddPacket.class)
public class ClientboundRecipeBookAddPacket_744056911Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_899924500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899924500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__164569358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164569358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1514480435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514480435L))
            info.setReturnValue("=<y4'\u8796dY<dde\u4ADF :B-#!yf[2\u12F9S:\u4C0BDX@\uF92APGn  Bk%vj5NWKw-^t2<M$D_\uD655\uC4D5E>?;1N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1301409001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301409001L))
            info.setReturnValue(-1486056096);
    }

    @Inject(at = @At("HEAD"), method = "replace()Z", cancellable = true)
    private void replace_1152146385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1152146385L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1040970510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1040970510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_448345047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(448345047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__847420684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-847420684L))
            info.cancel();
    }


}
