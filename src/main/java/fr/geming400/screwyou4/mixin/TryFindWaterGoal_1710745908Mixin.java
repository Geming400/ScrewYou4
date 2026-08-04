package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TryFindWaterGoal.class)
public class TryFindWaterGoal_1710745908Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1749020646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1749020646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1749024490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749024490L))
            info.setReturnValue(null);
    }


}
