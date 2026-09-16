package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.FogRenderer.class)
public class FogRenderer1946761139Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__167814290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-167814290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBuffer(Lnet/minecraft/client/renderer/fog/FogRenderer$FogMode;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getBuffer_1707230342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707230342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateBuffer(Lnet/minecraft/client/renderer/fog/FogData;)V", cancellable = true)
    private void updateBuffer_188930859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188930859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/Camera;ILnet/minecraft/client/DeltaTracker;FLnet/minecraft/client/multiplayer/ClientLevel;)Lnet/minecraft/client/renderer/fog/FogData;", cancellable = true)
    private void setupFog__944309636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944309636L))
            info.setReturnValue(new net.minecraft.client.renderer.fog.FogData());
    }

    @Inject(at = @At("HEAD"), method = "toggleFog()Z", cancellable = true)
    private static void toggleFog__817720360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-817720360L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1760477268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1760477268L))
            info.cancel();
    }


}
