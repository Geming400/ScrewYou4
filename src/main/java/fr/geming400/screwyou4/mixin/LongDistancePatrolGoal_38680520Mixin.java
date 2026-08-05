package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.PatrollingMonster.LongDistancePatrolGoal.class)
public class LongDistancePatrolGoal_38680520Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1587484840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587484840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1615783864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1615783864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__875759545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875759545L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__91003139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-91003139L))
            info.cancel();
    }


}
