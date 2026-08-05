package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMountScreenOpenPacket.class)
public class ClientboundMountScreenOpenPacket1723359142Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_44334054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44334054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1920866676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1920866676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1893539241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1893539241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInventoryColumns()I", cancellable = true)
    private void getInventoryColumns_1761621388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761621388L))
            info.setReturnValue(1123462158);
    }

    @Inject(at = @At("HEAD"), method = "getEntityId()I", cancellable = true)
    private void getEntityId_1761621388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761621388L))
            info.setReturnValue(1123462158);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1761621388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761621388L))
            info.setReturnValue(1123462158);
    }


}
