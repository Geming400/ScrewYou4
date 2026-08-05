package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.IsInWaterSensor.class)
public class IsInWaterSensor1410708820Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires_165773576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165773576L))
            info.setReturnValue(null);
    }


}
