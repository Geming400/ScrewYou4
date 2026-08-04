package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.Snowball.class)
public class Snowball_586821304Mixin {
        @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1794273628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1794273628L))
            info.cancel();
    }


}
