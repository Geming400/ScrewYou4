package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WeatherEffectRenderer.class)
public class WeatherEffectRenderer324757338Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1789818091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789818091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/state/level/WeatherRenderState;)V", cancellable = true)
    private void extractRenderState_432263175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432263175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/state/level/WeatherRenderState;)V", cancellable = true)
    private void render__323774734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-323774734L))
            info.cancel();
    }


}
