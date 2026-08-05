package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDeleteChatPacket.class)
public class ClientboundDeleteChatPacket_1145549728Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__533475361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533475361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1763905310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763905310L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_10089752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10089752L))
            info.setReturnValue("⧬yP᧲cp(lw*?t/'Ge#)Se@\"CꌾCOj'{LurA즨-W;Y<䥯dRa|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1183812469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183812469L))
            info.setReturnValue(76358121);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1343057261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1343057261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1823618640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823618640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "messageSignature()Lnet/minecraft/network/chat/MessageSignature$Packed;", cancellable = true)
    private void messageSignature__859979260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859979260L))
            info.setReturnValue(null);
    }


}
