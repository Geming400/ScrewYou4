package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatCommandSignedPacket.class)
public class ServerboundChatCommandSignedPacket988011502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__691013586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691013586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1921443535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921443535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__147448473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147448473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1026274244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026274244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__147448969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147448969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__880610492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-880610492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1666080415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1666080415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1026274709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026274709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentSignatures()Lnet/minecraft/commands/arguments/ArgumentSignatures;", cancellable = true)
    private void argumentSignatures__1417833746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417833746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeenMessages()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void lastSeenMessages__512559218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512559218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp_2085245702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085245702L))
            info.setReturnValue(null);
    }


}
