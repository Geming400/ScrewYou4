package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.UseItemGoal.class)
public class UseItemGoal_1860309633Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_234144273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(234144273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__857554319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-857554319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_945869568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945869568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1170674338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170674338L))
            info.setReturnValue(true);
    }


}
