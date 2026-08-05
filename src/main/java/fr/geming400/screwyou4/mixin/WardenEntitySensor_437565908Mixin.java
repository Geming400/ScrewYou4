package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.WardenEntitySensor.class)
public class WardenEntitySensor_437565908Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__807369337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807369337L))
            info.setReturnValue(null);
    }


}
