package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetEntityLookTargetSometimes.Ticker.class)
public class Ticker1925983483Mixin {
        @Inject(at = @At("HEAD"), method = "tickDownAndCheck(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void tickDownAndCheck__149430590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149430590L))
            info.setReturnValue(false);
    }


}
