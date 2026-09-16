package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionBufferBuilderPool.class)
public class SectionBufferBuilderPool_448641576Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1507757947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507757947L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1665933854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665933854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/client/renderer/SectionBufferBuilderPack;)V", cancellable = true)
    private void release__1053045257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1053045257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allocate(I)Lnet/minecraft/client/renderer/SectionBufferBuilderPool;", cancellable = true)
    private static void allocate__153469303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153469303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acquire()Lnet/minecraft/client/renderer/SectionBufferBuilderPack;", cancellable = true)
    private void acquire__603181824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603181824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFreeBufferCount()I", cancellable = true)
    private void getFreeBufferCount__707760192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707760192L))
            info.setReturnValue(1299938180);
    }


}
