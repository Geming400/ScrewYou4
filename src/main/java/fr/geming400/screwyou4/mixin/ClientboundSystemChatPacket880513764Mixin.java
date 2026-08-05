package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSystemChatPacket.class)
public class ClientboundSystemChatPacket880513764Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__798511324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798511324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2028941273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028941273L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__254946211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254946211L))
            info.setReturnValue("gN4>Vsek8:69#X3)\u6FC8XifK6u5/1#{H|RhV'#c\u83F6lvX?\u4ACB\u9A19QI7I<CM\u331APBUA\u5BE4\u799D\u3CAF\uD7E6oeX\u1320VnR`LlB\uB8DB+_^y:-DQr5I]{/m<wdYcWP,W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_918776506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918776506L))
            info.setReturnValue(1742451024);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1078021298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1078021298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1558582677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1558582677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1296395401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296395401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_918792347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918792347L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Z", cancellable = true)
    private void overlay_918792347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918792347L))
            info.setReturnValue(true);
    }


}
