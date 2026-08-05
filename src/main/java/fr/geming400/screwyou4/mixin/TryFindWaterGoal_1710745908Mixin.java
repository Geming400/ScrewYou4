package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TryFindWaterGoal.class)
public class TryFindWaterGoal_1710745908Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_84580548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(84580548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_796305843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796305843L))
            info.setReturnValue(false);
    }


}
