package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.PiglinBruteSpecificSensor.class)
public class PiglinBruteSpecificSensor967104017Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__861931469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861931469L))
            info.setReturnValue(null);
    }


}
