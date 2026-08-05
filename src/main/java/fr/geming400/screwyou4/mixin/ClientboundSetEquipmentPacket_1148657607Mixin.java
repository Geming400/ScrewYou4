package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket.class)
public class ClientboundSetEquipmentPacket_1148657607Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__530367482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530367482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1346165140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1346165140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1826726519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1826726519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity()I", cancellable = true)
    private void getEntity_1186919852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186919852L))
            info.setReturnValue(836106729);
    }

    @Inject(at = @At("HEAD"), method = "getSlots()Ljava/util/List;", cancellable = true)
    private void getSlots__1519972874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519972874L))
            info.setReturnValue(null);
    }


}
