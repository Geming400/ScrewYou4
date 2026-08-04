package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.SpectralArrow.class)
public class SpectralArrow_166301641Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_204576379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(204576379L))
            info.cancel();
    }


}
