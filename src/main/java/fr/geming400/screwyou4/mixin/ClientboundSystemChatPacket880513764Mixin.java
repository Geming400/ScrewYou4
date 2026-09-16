package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSystemChatPacket.class)
public class ClientboundSystemChatPacket880513764Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1036381354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036381354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__28112504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28112504L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1650937289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650937289L))
            info.setReturnValue(".q\u63CA's\u5B809m\uB082tR0o\u3551Vx^\uA6D0\u028El3A(x6'h#r9\uA2CEr8o8\u43A9$\u00C4-[E|)QI%+20j\u3C9ARj;a`3\u108C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1437865855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437865855L))
            info.setReturnValue(1361323396);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__710963830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-710963830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_584801901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(584801901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1122099024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122099024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Z", cancellable = true)
    private void overlay_1113429579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113429579L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_545043354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545043354L))
            info.setReturnValue(true);
    }


}
