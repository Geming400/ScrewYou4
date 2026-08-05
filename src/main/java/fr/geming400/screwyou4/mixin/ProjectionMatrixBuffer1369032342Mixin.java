package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ProjectionMatrixBuffer.class)
public class ProjectionMatrixBuffer1369032342Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__745543087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-745543087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBuffer(Lnet/minecraft/client/renderer/Projection;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getBuffer_918988027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918988027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBuffer(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getBuffer_341562951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341562951L))
            info.setReturnValue(null);
    }


}
