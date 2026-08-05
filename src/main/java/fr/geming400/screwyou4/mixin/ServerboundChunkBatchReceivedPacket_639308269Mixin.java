package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChunkBatchReceivedPacket.class)
public class ServerboundChunkBatchReceivedPacket_639308269Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1039716820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039716820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2024820527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024820527L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__496151707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496151707L))
            info.setReturnValue("HO3h+`3RF(ZxGN[R蔌2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_677571010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677571010L))
            info.setReturnValue(1480439091);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1229313726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1229313726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1317377181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1317377181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "desiredChunksPerTick()F", cancellable = true)
    private void desiredChunksPerTick_677567631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677567631L))
            info.setReturnValue(7.919947E8F);
    }


}
