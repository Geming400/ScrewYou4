package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSpectatorActionPacket.class)
public class ServerboundSpectatorActionPacket_1147555996Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1303423585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303423585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_238929727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238929727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1917979520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917979520L))
            info.setReturnValue("VG*Vb;e)Q $Ge`N,w6ag,GDhFd_qHqIX_a\u78FCbE9mi>{*}_X?\u52B6*)-89{HUC\u5DF3\u36F3fWfv0\u49E6lVCf_Q6dH#z!)G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1704908086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704908086L))
            info.setReturnValue(334124659);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_851844132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(851844132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1784916169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1784916169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spectateEntityId()Ljava/util/OptionalInt;", cancellable = true)
    private void spectateEntityId_1666568921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666568921L))
            info.setReturnValue(null);
    }


}
