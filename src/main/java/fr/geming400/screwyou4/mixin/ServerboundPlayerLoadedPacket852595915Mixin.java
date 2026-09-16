package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerLoadedPacket.class)
public class ServerboundPlayerLoadedPacket852595915Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1008463505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008463505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__56030353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56030353L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1623019440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623019440L))
            info.setReturnValue("? oF0/<=\u5887mLAOa?\uAB38t\uC51D\u52FBp3S^ZP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1409948006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409948006L))
            info.setReturnValue(2085359598);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_556884052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(556884052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1489956089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489956089L))
            info.cancel();
    }


}
