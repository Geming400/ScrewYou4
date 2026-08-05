package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniformStorage.class)
public class DynamicUniformStorage_1283233384Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1321508122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1321508122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUniform(Lnet/minecraft/client/renderer/DynamicUniformStorage$DynamicUniform;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeUniform_165780574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165780574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUniforms([Lnet/minecraft/client/renderer/DynamicUniformStorage$DynamicUniform;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeUniforms_132007258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132007258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1321508122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1321508122L))
            info.cancel();
    }


}
