package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData.class)
public class ClientboundLevelChunkPacketData_65862848Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write__32502406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-32502406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractChunkData(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private static void extractChunkData_1399271508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1399271508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntitiesTagsConsumer(II)Ljava/util/function/Consumer;", cancellable = true)
    private void getBlockEntitiesTagsConsumer_457147983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457147983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReadBuffer()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getReadBuffer__115035764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115035764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeightmaps()Ljava/util/Map;", cancellable = true)
    private void getHeightmaps__867400973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867400973L))
            info.setReturnValue(null);
    }


}
