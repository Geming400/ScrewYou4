package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.ParticlesRenderState.class)
public class ParticlesRenderState_697624830Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_735899568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(735899568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/state/level/ParticleGroupRenderState;)V", cancellable = true)
    private void add_892463064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(892463064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_2080759926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2080759926L))
            info.cancel();
    }


}
