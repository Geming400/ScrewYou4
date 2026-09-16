package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket.ChunkBiomeData.class)
public class ChunkBiomeData89015655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__819610613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819610613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_859439180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859439180L))
            info.setReturnValue("[9N8-wm\u5B23`>&iV\u2733G8i&2\u713D=/8`pss!:#Z\u2842+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_646367746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646367746L))
            info.setReturnValue(1637532668);
    }

    @Inject(at = @At("HEAD"), method = "buffer()[B", cancellable = true)
    private void buffer_1030230061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030230061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__1339971003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1339971003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void pos_2110095718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110095718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractChunkData(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private static void extractChunkData_1422424316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1422424316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReadBuffer()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getReadBuffer__91882956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91882956L))
            info.setReturnValue(null);
    }


}
