package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.GhastLookGoal.class)
public class GhastLookGoal1043927722Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_129487658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129487658L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_914244064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(914244064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1783593472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783593472L))
            info.setReturnValue(true);
    }


}
