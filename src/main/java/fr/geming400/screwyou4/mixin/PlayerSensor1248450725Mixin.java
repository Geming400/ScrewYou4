package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.PlayerSensor.class)
public class PlayerSensor1248450725Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires_3515481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3515481L))
            info.setReturnValue(null);
    }


}
