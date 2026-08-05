package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.NearestLivingEntitySensor.class)
public class NearestLivingEntitySensor938562390Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__306372854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306372854L))
            info.setReturnValue(null);
    }


}
