package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.ZombieAttackGoal.class)
public class ZombieAttackGoal_789341385Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_827616123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(827616123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_827616123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(827616123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_827616123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(827616123L))
            info.cancel();
    }


}
