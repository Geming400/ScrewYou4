package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SectionBufferBuilderPool.class)
public class SectionBufferBuilderPool_448641576Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_486920158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486920158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_486916314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(486916314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/client/renderer/SectionBufferBuilderPack;)V", cancellable = true)
    private void release_594995358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(594995358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allocate(I)Lnet/minecraft/client/renderer/SectionBufferBuilderPool;", cancellable = true)
    private static void allocate__86485850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86485850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acquire()Lnet/minecraft/client/renderer/SectionBufferBuilderPack;", cancellable = true)
    private void acquire__110321366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110321366L))
            info.setReturnValue(new net.minecraft.client.renderer.SectionBufferBuilderPack());
    }

    @Inject(at = @At("HEAD"), method = "getFreeBufferCount()I", cancellable = true)
    private void getFreeBufferCount_486903821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486903821L))
            info.setReturnValue(-1388204327);
    }


}
