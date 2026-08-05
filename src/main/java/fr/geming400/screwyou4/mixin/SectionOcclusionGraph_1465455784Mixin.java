package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionOcclusionGraph.class)
public class SectionOcclusionGraph_1465455784Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/state/level/CameraRenderState;ILnet/minecraft/client/renderer/state/level/ChunkLoadingRenderState;)V", cancellable = true)
    private void update_530532919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530532919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNode(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)Lnet/minecraft/client/renderer/SectionOcclusionGraph$Node;", cancellable = true)
    private void getNode__249859279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249859279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidate()V", cancellable = true)
    private void invalidate_1503730522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503730522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateLoadedChunks(Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;)V", cancellable = true)
    private void updateLoadedChunks_1257387802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257387802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSectionsInFrustum(Lnet/minecraft/client/renderer/culling/Frustum;Ljava/util/List;Ljava/util/List;)V", cancellable = true)
    private void addSectionsInFrustum_215127116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(215127116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateEmptySections(Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;)V", cancellable = true)
    private void updateEmptySections_1257387802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257387802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "consumeFrustumUpdate()Z", cancellable = true)
    private void consumeFrustumUpdate_1503734366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503734366L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "invalidateIfNeeded(Lnet/minecraft/client/renderer/state/level/CameraRenderState;I)V", cancellable = true)
    private void invalidateIfNeeded__1119134675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1119134675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOctree()Lnet/minecraft/client/renderer/Octree;", cancellable = true)
    private void getOctree__2118580953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2118580953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waitAndReset(Lnet/minecraft/client/renderer/ViewArea;)V", cancellable = true)
    private void waitAndReset__73473093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-73473093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "schedulePropagationFrom(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)V", cancellable = true)
    private void schedulePropagationFrom_1619625602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1619625602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "expectedChunks()Lit/unimi/dsi/fastutil/longs/LongCollection;", cancellable = true)
    private void expectedChunks_2122230766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122230766L))
            info.setReturnValue(null);
    }


}
