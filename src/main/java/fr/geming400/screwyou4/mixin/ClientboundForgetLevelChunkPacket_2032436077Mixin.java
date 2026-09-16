package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket.class)
public class ClientboundForgetLevelChunkPacket_2032436077Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2106663630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106663630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1123809808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123809808L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1492107695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492107695L))
            info.setReturnValue("<\u5EBE6\u433D\u3D1BHzu\u6D355{\u4682-i Zg\u423D(,AH$;=5!qbpK\u80F6/nYzHn\uFD22(D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1705179129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705179129L))
            info.setReturnValue(604250341);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void pos__241451157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241451157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1736724213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1736724213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_440958482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(440958482L))
            info.cancel();
    }


}
