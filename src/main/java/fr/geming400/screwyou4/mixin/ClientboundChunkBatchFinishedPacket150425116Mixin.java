package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunkBatchFinishedPacket.class)
public class ClientboundChunkBatchFinishedPacket150425116Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1528599972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528599972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1535937375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535937375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__985034859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985034859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_188687858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188687858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_347932650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(347932650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_828494029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(828494029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "batchSize()I", cancellable = true)
    private void batchSize_188687362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188687362L))
            info.setReturnValue(null);
    }


}
