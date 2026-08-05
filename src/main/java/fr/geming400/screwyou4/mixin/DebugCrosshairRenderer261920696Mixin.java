package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DebugCrosshairRenderer.class)
public class DebugCrosshairRenderer261920696Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1852654733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1852654733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/level/CameraRenderState;I)V", cancellable = true)
    private void render_854187496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(854187496L))
            info.cancel();
    }


}
