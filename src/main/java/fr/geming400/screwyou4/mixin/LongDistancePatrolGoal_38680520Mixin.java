package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.PatrollingMonster.LongDistancePatrolGoal.class)
public class LongDistancePatrolGoal_38680520Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_76955258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76955258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_76955258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76955258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_76959102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76959102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_76955258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76955258L))
            info.cancel();
    }


}
