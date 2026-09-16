package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetHeldSlotPacket.class)
public class ClientboundSetHeldSlotPacket997071804Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_1631098468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631098468L))
            info.setReturnValue(-1704529797);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1152939394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1152939394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_88445536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88445536L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1767495329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767495329L))
            info.setReturnValue("wGWQj\uB172P/.\uA322\uAA2DDm!))y#n<QU1qdMwx\uA1E4wsXw|\u0A2E(z/i$[\u3599");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1554423895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554423895L))
            info.setReturnValue(107403348);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_701359941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(701359941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__594405790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-594405790L))
            info.cancel();
    }


}
