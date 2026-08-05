package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal.class)
public class HurtByTargetGoal2115850322Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_489684963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(489684963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1201410258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201410258L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAlertOthers([Ljava/lang/Class;)Lnet/minecraft/world/entity/ai/goal/target/HurtByTargetGoal;", cancellable = true)
    private void setAlertOthers_236453437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236453437L))
            info.setReturnValue(null);
    }


}
