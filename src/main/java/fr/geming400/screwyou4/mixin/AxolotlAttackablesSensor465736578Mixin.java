package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.sensing.AxolotlAttackablesSensor.class)
public class AxolotlAttackablesSensor465736578Mixin {
        @Inject(at = @At("HEAD"), method = "requires()Ljava/util/Set;", cancellable = true)
    private void requires__779198666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779198666L))
            info.setReturnValue(null);
    }


}
