package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionBufferBuilderPack.class)
public class SectionBufferBuilderPack_461929323Mixin {
        @Inject(at = @At("HEAD"), method = "buffer(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lcom/mojang/blaze3d/vertex/ByteBufferBuilder;", cancellable = true)
    private void buffer__414675945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414675945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1652646107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1652646107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearAll()V", cancellable = true)
    private void clearAll_1468949129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468949129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardAll()V", cancellable = true)
    private void discardAll__2118331430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118331430L))
            info.cancel();
    }


}
