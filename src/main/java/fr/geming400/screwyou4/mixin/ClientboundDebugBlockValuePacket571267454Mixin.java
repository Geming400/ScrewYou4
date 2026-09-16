package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugBlockValuePacket.class)
public class ClientboundDebugBlockValuePacket571267454Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_727135044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727135044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__337358814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337358814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1341690979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341690979L))
            info.setReturnValue("6B,%g7\u0114Gc\u5419dd,5\u77D7!@T64=w\uC3E6FTX2VZ+Ak`V\u3695");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1128619545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128619545L))
            info.setReturnValue(1103627359);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update_1134647943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134647943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_275555591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(275555591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1020210140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1020210140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPos__1448530600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448530600L))
            info.setReturnValue(null);
    }


}
