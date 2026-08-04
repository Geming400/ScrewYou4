package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.DefendVillageTargetGoal.class)
public class DefendVillageTargetGoal1367043564Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1405318303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405318303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1405322147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405322147L))
            info.setReturnValue(null);
    }


}
