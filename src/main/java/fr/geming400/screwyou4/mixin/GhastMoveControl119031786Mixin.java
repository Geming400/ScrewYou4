package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.GhastMoveControl.class)
public class GhastMoveControl119031786Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_157306525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(157306525L))
            info.cancel();
    }


}
