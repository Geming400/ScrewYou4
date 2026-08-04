package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.NearestBedSensor.class)
public class NearestBedSensor1450988807Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__378046679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378046679L))
            info.setReturnValue(null);
    }


}
