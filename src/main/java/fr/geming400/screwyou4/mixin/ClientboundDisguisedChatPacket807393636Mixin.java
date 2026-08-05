package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDisguisedChatPacket.class)
public class ClientboundDisguisedChatPacket807393636Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__871631452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871631452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2102061401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2102061401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__328066339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328066339L))
            info.setReturnValue(" \u98ED\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_845656378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845656378L))
            info.setReturnValue(104341164);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1369515529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369515529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1004901170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1004901170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1485462549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485462549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_845672219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845672219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void chatType_1420552346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420552346L))
            info.setReturnValue(null);
    }


}
