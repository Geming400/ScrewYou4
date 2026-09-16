package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket.class)
public class ClientboundSetActionBarTextPacket_800149755Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_956017344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(956017344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__108476514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108476514L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1570573279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570573279L))
            info.setReturnValue("YML\u919A6?\u7F12QV`5{Z!F?Faect\uB25FV\uACA7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1357501845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357501845L))
            info.setReturnValue(-2044343141);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_504437891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504437891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__791327840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791327840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__100610438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100610438L))
            info.setReturnValue(null);
    }


}
