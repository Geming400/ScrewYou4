package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket.ChunkBiomeData.class)
public class ChunkBiomeData89015655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1474527914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474527914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1046444320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046444320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_127278397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127278397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buffer()[B", cancellable = true)
    private void buffer_1274850285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274850285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__264477466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-264477466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void pos__800083182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800083182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractChunkData(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private static void extractChunkData_101490374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(101490374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReadBuffer()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getReadBuffer_1000058656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000058656L))
            info.setReturnValue(null);
    }


}
