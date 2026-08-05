package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.SecondaryPoiSensor.class)
public class SecondaryPoiSensor_585683974Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__659251271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659251271L))
            info.setReturnValue(null);
    }


}
