package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerSlotStateChangedPacket.class)
public class ServerboundContainerSlotStateChangedPacket_1457689919Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__221335170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221335170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1451765119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451765119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_322229943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322229943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1495952660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495952660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newState()Z", cancellable = true)
    private void newState_1495968501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495968501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_2135758831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2135758831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__410932076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-410932076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId_1495952164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495952164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_1495952164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495952164L))
            info.setReturnValue(null);
    }


}
