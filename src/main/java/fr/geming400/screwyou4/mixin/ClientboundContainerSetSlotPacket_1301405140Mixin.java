package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket.class)
public class ClientboundContainerSetSlotPacket_1301405140Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__377619949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377619949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()I", cancellable = true)
    private void getSlot_1339667385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339667385L))
            info.setReturnValue(-672522338);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1498912673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1498912673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1979474052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979474052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1824823799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824823799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId_1339667385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339667385L))
            info.setReturnValue(-672522338);
    }

    @Inject(at = @At("HEAD"), method = "getStateId()I", cancellable = true)
    private void getStateId_1339667385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339667385L))
            info.setReturnValue(-672522338);
    }


}
