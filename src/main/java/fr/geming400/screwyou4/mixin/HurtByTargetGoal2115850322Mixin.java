package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal.class)
public class HurtByTargetGoal2115850322Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__2140842235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2140842235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__2140838391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140838391L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAlertOthers([Ljava/lang/Class;)Lnet/minecraft/world/entity/ai/goal/target/HurtByTargetGoal;", cancellable = true)
    private void setAlertOthers__214846112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214846112L))
            info.setReturnValue(null);
    }


}
