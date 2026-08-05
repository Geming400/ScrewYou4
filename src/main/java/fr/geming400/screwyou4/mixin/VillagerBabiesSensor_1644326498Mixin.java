package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.VillagerBabiesSensor.class)
public class VillagerBabiesSensor_1644326498Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires_399391253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399391253L))
            info.setReturnValue(null);
    }


}
