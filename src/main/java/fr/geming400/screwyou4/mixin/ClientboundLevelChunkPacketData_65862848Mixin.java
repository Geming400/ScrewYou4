package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData.class)
public class ClientboundLevelChunkPacketData_65862848Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/RegistryFriendlyByteBuf;)V", cancellable = true)
    private void write_2077923099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2077923099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeightmaps()Ljava/util/Map;", cancellable = true)
    private void getHeightmaps__1938760793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938760793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReadBuffer()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getReadBuffer_976905848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976905848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntitiesTagsConsumer(II)Ljava/util/function/Consumer;", cancellable = true)
    private void getBlockEntitiesTagsConsumer__1967874378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967874378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractChunkData(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private static void extractChunkData_78337566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78337566L))
            info.cancel();
    }


}
