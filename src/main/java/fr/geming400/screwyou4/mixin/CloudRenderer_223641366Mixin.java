package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CloudRenderer.class)
public class CloudRenderer_223641366Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1890934064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1890934064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_37357494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(37357494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(ILnet/minecraft/client/CloudStatus;FILnet/minecraft/world/phys/Vec3;JF)V", cancellable = true)
    private void render_1188573350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188573350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForRebuild()V", cancellable = true)
    private void markForRebuild_456415081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(456415081L))
            info.cancel();
    }


}
