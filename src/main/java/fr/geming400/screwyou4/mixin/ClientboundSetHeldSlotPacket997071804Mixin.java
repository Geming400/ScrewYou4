package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket.class)
public class ClientboundSetHeldSlotPacket997071804Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_1035334050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035334050L))
            info.setReturnValue(-1247944049);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__681953284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681953284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1912383233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912383233L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__138388171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-138388171L))
            info.setReturnValue("imyi/x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1035334546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035334546L))
            info.setReturnValue(-1426467539);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1675140717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1675140717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1194579338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194579338L))
            info.cancel();
    }


}
