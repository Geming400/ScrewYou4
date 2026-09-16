package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatSessionUpdatePacket.class)
public class ServerboundChatSessionUpdatePacket_701616986Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_857484575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857484575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__207009283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207009283L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1472040510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472040510L))
            info.setReturnValue("k/-$gNwv8,&Uwm\"k\"XoG]B^]<uvA\u4E5ASN/Xq!\u90A4h\u4CA6:l|H-}\uC48FbX\uCC70i\u80DAh`k=AOBaLD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1258969076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258969076L))
            info.setReturnValue(-1036649699);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1338977159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1338977159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_405905122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405905122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chatSession()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void chatSession_388596583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388596583L))
            info.setReturnValue(null);
    }


}
