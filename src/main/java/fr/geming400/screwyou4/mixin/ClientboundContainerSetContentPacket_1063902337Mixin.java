package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket.class)
public class ClientboundContainerSetContentPacket_1063902337Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__615122752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615122752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1845552701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845552701L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__71557639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-71557639L))
            info.setReturnValue("@쯂'튁'T 竍f+刼W'z'@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1102165078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102165078L))
            info.setReturnValue(-1132886963);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1741971249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741971249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1261409870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261409870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items__1604728144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604728144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_1102164582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102164582L))
            info.setReturnValue(-954363474);
    }

    @Inject(at = @At("HEAD"), method = "carriedItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void carriedItem_1587320996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587320996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateId()I", cancellable = true)
    private void stateId_1102164582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102164582L))
            info.setReturnValue(-954363474);
    }


}
