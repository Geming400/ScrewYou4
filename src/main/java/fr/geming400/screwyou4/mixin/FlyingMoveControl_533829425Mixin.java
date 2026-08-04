package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.FlyingMoveControl.class)
public class FlyingMoveControl_533829425Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_572104163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(572104163L))
            info.cancel();
    }


}
