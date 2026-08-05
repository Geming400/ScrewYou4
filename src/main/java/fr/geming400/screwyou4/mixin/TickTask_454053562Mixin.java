package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.TickTask.class)
public class TickTask_454053562Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_492328300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(492328300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTick()I", cancellable = true)
    private void getTick_492315807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492315807L))
            info.setReturnValue(1161767772);
    }


}
