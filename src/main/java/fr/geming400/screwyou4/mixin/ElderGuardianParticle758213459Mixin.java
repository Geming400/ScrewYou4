package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ElderGuardianParticle.class)
public class ElderGuardianParticle758213459Mixin {
        @Inject(at = @At("HEAD"), method = "getGroup()Lnet/minecraft/client/particle/ParticleRenderType;", cancellable = true)
    private void getGroup_839451579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839451579L))
            info.setReturnValue(null);
    }


}
