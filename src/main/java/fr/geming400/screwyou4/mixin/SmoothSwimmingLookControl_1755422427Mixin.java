package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl.class)
public class SmoothSwimmingLookControl_1755422427Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1625738768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1625738768L))
            info.cancel();
    }


}
