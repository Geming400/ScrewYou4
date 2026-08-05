package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.ParticlesRenderState.class)
public class ParticlesRenderState_697624830Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1031812159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1031812159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/state/level/ParticleGroupRenderState;)V", cancellable = true)
    private void add__1004266409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1004266409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1048199006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1048199006L))
            info.cancel();
    }


}
