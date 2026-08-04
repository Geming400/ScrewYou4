package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WeatherEffectRenderer.class)
public class WeatherEffectRenderer324757338Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_363032077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(363032077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/state/level/WeatherRenderState;)V", cancellable = true)
    private void render__2048660772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2048660772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/multiplayer/ClientLevel;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/state/level/WeatherRenderState;)V", cancellable = true)
    private void extractRenderState__1349365215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1349365215L))
            info.cancel();
    }


}
