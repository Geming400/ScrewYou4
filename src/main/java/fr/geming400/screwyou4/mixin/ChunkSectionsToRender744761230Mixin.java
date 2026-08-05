package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.ChunkSectionsToRender.class)
public class ChunkSectionsToRender744761230Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2130273489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130273489L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__390698745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390698745L))
            info.setReturnValue("#QPFstmTZP0k_Jv뜨'0홙m世秩el/!䂰iKjb3@6C|ӷ[⼳<GTE)l;u7条bs⋢ >$h!GpO9蔍[)a<-ᔍ25ﬥ=omL`].ⓡcs^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_783023972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783023972L))
            info.setReturnValue(653621603);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__1655853380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655853380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkSectionInfos()[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void chunkSectionInfos_1862472332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862472332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderGroup(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;Lcom/mojang/blaze3d/textures/GpuSampler;)V", cancellable = true)
    private void renderGroup__1159441453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1159441453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxIndicesRequired()I", cancellable = true)
    private void maxIndicesRequired_783023476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783023476L))
            info.setReturnValue(856769022);
    }

    @Inject(at = @At("HEAD"), method = "drawGroupsPerLayer()Ljava/util/EnumMap;", cancellable = true)
    private void drawGroupsPerLayer_1635001687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635001687L))
            info.setReturnValue(null);
    }


}
