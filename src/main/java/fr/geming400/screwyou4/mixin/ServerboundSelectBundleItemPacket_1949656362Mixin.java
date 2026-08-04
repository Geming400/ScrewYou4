package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSelectBundleItemPacket.class)
public class ServerboundSelectBundleItemPacket_1949656362Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_270631273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270631273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__959798676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959798676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_814196386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814196386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1987919103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987919103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_81034367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81034367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1667242022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1667242022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId_1987918607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987918607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectedItemIndex()I", cancellable = true)
    private void selectedItemIndex_1987918607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987918607L))
            info.setReturnValue(null);
    }


}
