package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ElderGuardianParticleGroup.class)
public class ElderGuardianParticleGroup796729374Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/renderer/culling/Frustum;Lnet/minecraft/client/Camera;F)Lnet/minecraft/client/renderer/state/level/ParticleGroupRenderState;", cancellable = true)
    private void extractRenderState_457598407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457598407L))
            info.setReturnValue(null);
    }


}
