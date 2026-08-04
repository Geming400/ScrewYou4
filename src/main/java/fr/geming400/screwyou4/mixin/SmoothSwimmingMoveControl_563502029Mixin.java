package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl.class)
public class SmoothSwimmingMoveControl_563502029Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_601776767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(601776767L))
            info.cancel();
    }


}
