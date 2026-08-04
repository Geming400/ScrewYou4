package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.SkeletonTrapGoal.class)
public class SkeletonTrapGoal1701097891Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1739376474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739376474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1739372630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1739372630L))
            info.cancel();
    }


}
