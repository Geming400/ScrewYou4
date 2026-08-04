package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.HoglinSpecificSensor.class)
public class HoglinSpecificSensor_1816493465Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__12542022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-12542022L))
            info.setReturnValue(null);
    }


}
