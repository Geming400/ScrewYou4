package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.class)
public class SectionRenderDispatcher1989098964Mixin {
        @Inject(at = @At("HEAD"), method = "lock()V", cancellable = true)
    private void lock_2027373703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027373703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unlock()V", cancellable = true)
    private void unlock_2027373703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027373703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dispose()V", cancellable = true)
    private void dispose_2027373703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027373703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Ljava/lang/String;", cancellable = true)
    private void getStats_853638493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853638493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearCompileQueue()V", cancellable = true)
    private void clearCompileQueue_2027373703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027373703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCompiler(Lnet/minecraft/client/renderer/chunk/SectionCompiler;)V", cancellable = true)
    private void setCompiler__804508168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-804508168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isQueueEmpty()Z", cancellable = true)
    private void isQueueEmpty_2027377547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027377547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFreeBufferCount()I", cancellable = true)
    private void getFreeBufferCount_2027361210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027361210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompileQueueSize()I", cancellable = true)
    private void getCompileQueueSize_2027361210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027361210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadTerrainBuffersToGpu()V", cancellable = true)
    private void uploadTerrainBuffersToGpu_2027373703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2027373703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCameraPosition(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setCameraPosition__1938132333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1938132333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderSectionSlice(Lnet/minecraft/client/renderer/chunk/SectionMesh;Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSectionBufferSlice;", cancellable = true)
    private void getRenderSectionSlice_654944902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654944902L))
            info.setReturnValue(null);
    }


}
