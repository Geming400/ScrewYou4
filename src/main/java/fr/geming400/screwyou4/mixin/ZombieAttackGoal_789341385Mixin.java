package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.ZombieAttackGoal.class)
public class ZombieAttackGoal_789341385Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__836823975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-836823975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1928522567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928522567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_659657726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659657726L))
            info.cancel();
    }


}
