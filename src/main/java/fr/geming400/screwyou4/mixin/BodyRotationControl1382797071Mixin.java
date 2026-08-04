package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.control.BodyRotationControl.class)
public class BodyRotationControl1382797071Mixin {
        @Inject(at = @At("HEAD"), method = "clientTick()V", cancellable = true)
    private void clientTick_1421071810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421071810L))
            info.cancel();
    }


}
