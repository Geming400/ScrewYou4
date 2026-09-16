package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerClickPacket.class)
public class ServerboundContainerClickPacket_591688116Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_747555705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747555705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__316938153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316938153L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1362111640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362111640L))
            info.setReturnValue("Q|?\uAEC6]R[QtBvnA@h+tz21$[#z$oi\u5590M8uj \u3349}V|E%Z\u6BEDCPo8e<Xf\uC823CS\uC2B4mFqvG1{;\uCCD09+20,Ok9\":xz?A#R0o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1149040206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149040206L))
            info.setReturnValue(-5432514);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1229048289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1229048289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_295976252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(295976252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId__318727267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318727267L))
            info.setReturnValue(1779003707);
    }

    @Inject(at = @At("HEAD"), method = "carriedItem()Lnet/minecraft/network/HashedStack;", cancellable = true)
    private void carriedItem__666105196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666105196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerInput()Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private void containerInput_1976675229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976675229L))
            info.setReturnValue(net.minecraft.world.inventory.ContainerInput.THROW);
    }

    @Inject(at = @At("HEAD"), method = "stateId()I", cancellable = true)
    private void stateId__1930235507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930235507L))
            info.setReturnValue(1612637671);
    }

    @Inject(at = @At("HEAD"), method = "buttonNum()B", cancellable = true)
    private void buttonNum__1047920930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047920930L))
            info.setReturnValue(64);
    }

    @Inject(at = @At("HEAD"), method = "slotNum()S", cancellable = true)
    private void slotNum_327447931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327447931L))
            info.setReturnValue((short) 12129);
    }

    @Inject(at = @At("HEAD"), method = "changedSlots()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void changedSlots__1949357634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949357634L))
            info.setReturnValue(null);
    }


}
