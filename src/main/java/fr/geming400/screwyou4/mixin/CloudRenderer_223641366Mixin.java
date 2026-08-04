package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CloudRenderer.class)
public class CloudRenderer_223641366Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_261916104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(261916104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(ILnet/minecraft/client/CloudStatus;FILnet/minecraft/world/phys/Vec3;JF)V", cancellable = true)
    private void render_669613052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(669613052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForRebuild()V", cancellable = true)
    private void markForRebuild_261916104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(261916104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_261916104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(261916104L))
            info.cancel();
    }


}
