package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DebugCrosshairRenderer.class)
public class DebugCrosshairRenderer261920696Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_300195435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(300195435L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/level/CameraRenderState;I)V", cancellable = true)
    private void render_1972297534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972297534L))
            info.cancel();
    }


}
