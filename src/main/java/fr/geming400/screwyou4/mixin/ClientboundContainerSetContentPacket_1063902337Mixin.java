package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket.class)
public class ClientboundContainerSetContentPacket_1063902337Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1219769926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1219769926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_155276068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155276068L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1834325861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834325861L))
            info.setReturnValue("\u5101yQ4l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1621254427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621254427L))
            info.setReturnValue(1613858267);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_768190473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768190473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__527575258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-527575258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items_1041650288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041650288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_153486954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153486954L))
            info.setReturnValue(-2056881397);
    }

    @Inject(at = @At("HEAD"), method = "carriedItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void carriedItem__1703624511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1703624511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateId()I", cancellable = true)
    private void stateId__1458021286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458021286L))
            info.setReturnValue(2100235044);
    }


}
