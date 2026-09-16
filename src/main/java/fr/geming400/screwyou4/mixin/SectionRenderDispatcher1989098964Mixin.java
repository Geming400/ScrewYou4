package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.class)
public class SectionRenderDispatcher1989098964Mixin {
        @Inject(at = @At("HEAD"), method = "lock()V", cancellable = true)
    private void lock_1006109244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1006109244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unlock()V", cancellable = true)
    private void unlock_1074548675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1074548675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dispose()V", cancellable = true)
    private void dispose__1587537464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587537464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isQueueEmpty()Z", cancellable = true)
    private void isQueueEmpty_439360453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439360453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFreeBufferCount()I", cancellable = true)
    private void getFreeBufferCount_832697197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832697197L))
            info.setReturnValue(1204603767);
    }

    @Inject(at = @At("HEAD"), method = "getCompileQueueSize()I", cancellable = true)
    private void getCompileQueueSize__1774429787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774429787L))
            info.setReturnValue(-727313321);
    }

    @Inject(at = @At("HEAD"), method = "getRenderSectionSlice(Lnet/minecraft/client/renderer/chunk/SectionMesh;Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSectionBufferSlice;", cancellable = true)
    private void getRenderSectionSlice_817151135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817151135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCameraPosition(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setCameraPosition__976422141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-976422141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "uploadTerrainBuffersToGpu()V", cancellable = true)
    private void uploadTerrainBuffersToGpu__112766987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-112766987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCompileQueue()V", cancellable = true)
    private void clearCompileQueue_1534381532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1534381532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCompiler(Lnet/minecraft/client/renderer/chunk/SectionCompiler;)V", cancellable = true)
    private void setCompiler__1459724839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1459724839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Ljava/lang/String;", cancellable = true)
    private void getStats__358423674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358423674L))
            info.setReturnValue("?/");
    }


}
