package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.DummySensor.class)
public class DummySensor_743946860Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__500988385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500988385L))
            info.setReturnValue(null);
    }


}
