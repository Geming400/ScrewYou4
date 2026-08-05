package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.FogRenderer.class)
public class FogRenderer1946761139Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1985035878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1985035878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBuffer(Lnet/minecraft/client/renderer/fog/FogRenderer$FogMode;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getBuffer_925717968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925717968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1985035878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1985035878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateBuffer(Lnet/minecraft/client/renderer/fog/FogData;)V", cancellable = true)
    private void updateBuffer_1066103490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066103490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupFog(Lnet/minecraft/client/Camera;ILnet/minecraft/client/DeltaTracker;FLnet/minecraft/client/multiplayer/ClientLevel;)Lnet/minecraft/client/renderer/fog/FogData;", cancellable = true)
    private void setupFog_1041545117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041545117L))
            info.setReturnValue(new net.minecraft.client.renderer.fog.FogData());
    }

    @Inject(at = @At("HEAD"), method = "toggleFog()Z", cancellable = true)
    private static void toggleFog_1985039970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985039970L))
            info.setReturnValue(false);
    }


}
