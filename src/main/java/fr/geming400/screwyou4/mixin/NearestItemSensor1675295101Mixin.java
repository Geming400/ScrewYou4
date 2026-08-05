package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.NearestItemSensor.class)
public class NearestItemSensor1675295101Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires_430359857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430359857L))
            info.setReturnValue(null);
    }


}
