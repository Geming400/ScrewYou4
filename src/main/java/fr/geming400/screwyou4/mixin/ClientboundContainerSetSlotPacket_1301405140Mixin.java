package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket.class)
public class ClientboundContainerSetSlotPacket_1301405140Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1457272729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457272729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()I", cancellable = true)
    private void getSlot_1925827013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925827013L))
            info.setReturnValue(321168578);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__290072455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-290072455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1005693276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1005693276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_807239808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807239808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateId()I", cancellable = true)
    private void getStateId_405991459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405991459L))
            info.setReturnValue(-1494697539);
    }

    @Inject(at = @At("HEAD"), method = "getContainerId()I", cancellable = true)
    private void getContainerId__1088000205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088000205L))
            info.setReturnValue(-2108616054);
    }


}
