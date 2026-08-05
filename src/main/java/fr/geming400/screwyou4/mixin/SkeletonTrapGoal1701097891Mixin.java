package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.SkeletonTrapGoal.class)
public class SkeletonTrapGoal1701097891Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_786657827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786657827L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1571414233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571414233L))
            info.cancel();
    }


}
