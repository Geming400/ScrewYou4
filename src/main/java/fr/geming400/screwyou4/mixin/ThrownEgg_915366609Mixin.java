package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownEgg.class)
public class ThrownEgg_915366609Mixin {
        @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1669114724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1669114724L))
            info.cancel();
    }


}
