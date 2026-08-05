package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WorldBorderRenderer.class)
public class WorldBorderRenderer_827681453Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/border/WorldBorder;FLnet/minecraft/world/phys/Vec3;DLnet/minecraft/client/renderer/state/level/WorldBorderRenderState;)V", cancellable = true)
    private void extract_372471123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(372471123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1286893977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1286893977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidate()V", cancellable = true)
    private void invalidate__453915388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-453915388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/level/WorldBorderRenderState;Lnet/minecraft/world/phys/Vec3;DD)V", cancellable = true)
    private void render__1843321484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1843321484L))
            info.cancel();
    }


}
