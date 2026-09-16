package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniformStorage.class)
public class DynamicUniformStorage_1283233384Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__831342046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-831342046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1096949512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096949512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUniforms([Lnet/minecraft/client/renderer/DynamicUniformStorage$DynamicUniform;)[Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeUniforms__314288676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314288676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUniform(Lnet/minecraft/client/renderer/DynamicUniformStorage$DynamicUniform;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void writeUniform_424142185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424142185L))
            info.setReturnValue(null);
    }


}
