package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionOcclusionGraph.class)
public class SectionOcclusionGraph_1465455784Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/state/level/CameraRenderState;ILnet/minecraft/client/renderer/state/level/ChunkLoadingRenderState;)V", cancellable = true)
    private void update_1798338624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798338624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNode(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)Lnet/minecraft/client/renderer/SectionOcclusionGraph$Node;", cancellable = true)
    private void getNode_764257209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764257209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidate()V", cancellable = true)
    private void invalidate_183858943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183858943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "schedulePropagationFrom(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)V", cancellable = true)
    private void schedulePropagationFrom_1214048385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214048385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitAndReset(Lnet/minecraft/client/renderer/ViewArea;)V", cancellable = true)
    private void waitAndReset_895928974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(895928974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "expectedChunks()Lit/unimi/dsi/fastutil/longs/LongCollection;", cancellable = true)
    private void expectedChunks__1118638996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118638996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateLoadedChunks(Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;)V", cancellable = true)
    private void updateLoadedChunks_273207590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273207590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSectionsInFrustum(Lnet/minecraft/client/renderer/culling/Frustum;Ljava/util/List;Ljava/util/List;)V", cancellable = true)
    private void addSectionsInFrustum__742292326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-742292326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "consumeFrustumUpdate()Z", cancellable = true)
    private void consumeFrustumUpdate__1879394929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879394929L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "invalidateIfNeeded(Lnet/minecraft/client/renderer/state/level/CameraRenderState;I)V", cancellable = true)
    private void invalidateIfNeeded__296690816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-296690816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateEmptySections(Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;)V", cancellable = true)
    private void updateEmptySections_1164659848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1164659848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOctree()Lnet/minecraft/client/renderer/Octree;", cancellable = true)
    private void getOctree_1419255183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419255183L))
            info.setReturnValue(null);
    }


}
