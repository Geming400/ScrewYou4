package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerClickPacket.class)
public class ServerboundContainerClickPacket_591688116Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1087336973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087336973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1977200374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977200374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__543771860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543771860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_629950857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629950857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1269757028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269757028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1276933879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1276933879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "carriedItem()Lnet/minecraft/network/HashedStack;", cancellable = true)
    private void carriedItem__5756335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5756335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerInput()Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private void containerInput_1676037140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676037140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonNum()B", cancellable = true)
    private void buttonNum_629943634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629943634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateId()I", cancellable = true)
    private void stateId_629950361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629950361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_629950361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629950361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedSlots()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void changedSlots__766625891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766625891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotNum()S", cancellable = true)
    private void slotNum_629959971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629959971L))
            info.setReturnValue(null);
    }


}
