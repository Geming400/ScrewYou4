package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEquipmentPacket.class)
public class ClientboundSetEquipmentPacket_1148657607Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1304525196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304525196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__442819988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-442819988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_852945743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(852945743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity()I", cancellable = true)
    private void getEntity_1737051763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737051763L))
            info.setReturnValue(-1944947809);
    }

    @Inject(at = @At("HEAD"), method = "getSlots()Ljava/util/List;", cancellable = true)
    private void getSlots__233319179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233319179L))
            info.setReturnValue(null);
    }


}
