package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.HurtBySensor.class)
public class HurtBySensor_532687478Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__1296348009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296348009L))
            info.setReturnValue(null);
    }


}
