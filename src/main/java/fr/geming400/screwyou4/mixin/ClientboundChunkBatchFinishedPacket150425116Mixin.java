package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunkBatchFinishedPacket.class)
public class ClientboundChunkBatchFinishedPacket150425116Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_306292706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306292706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__758201152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758201152L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_920848641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920848641L))
            info.setReturnValue("J>kJEmcNg-v\u5DB8D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_707777207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707777207L))
            info.setReturnValue(1936436897);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1441052478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1441052478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__145286747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-145286747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "batchSize()I", cancellable = true)
    private void batchSize__1070668153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070668153L))
            info.setReturnValue(1950775860);
    }


}
