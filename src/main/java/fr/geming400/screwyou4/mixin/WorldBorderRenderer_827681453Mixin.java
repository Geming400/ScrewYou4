package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WorldBorderRenderer.class)
public class WorldBorderRenderer_827681453Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/border/WorldBorder;FLnet/minecraft/world/phys/Vec3;DLnet/minecraft/client/renderer/state/level/WorldBorderRenderState;)V", cancellable = true)
    private void extract__701730926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-701730926L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_865956191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865956191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidate()V", cancellable = true)
    private void invalidate_865956191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865956191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/renderer/state/level/WorldBorderRenderState;Lnet/minecraft/world/phys/Vec3;DD)V", cancellable = true)
    private void render__2030476834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2030476834L))
            info.cancel();
    }


}
