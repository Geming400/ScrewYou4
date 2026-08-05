package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.WrappedGoal.class)
public class WrappedGoal484832394Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1870344157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870344157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_523094640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523094640L))
            info.setReturnValue(1080041377);
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_523107133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(523107133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPriority()I", cancellable = true)
    private void getPriority_523094640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523094640L))
            info.setReturnValue(1080041377);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_523107133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(523107133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_523110977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523110977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setFlags(Ljava/util/EnumSet;)V", cancellable = true)
    private void setFlags__227379373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227379373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_523107133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(523107133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_523110977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523110977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFlags()Ljava/util/EnumSet;", cancellable = true)
    private void getFlags_1550661005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550661005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedBy(Lnet/minecraft/world/entity/ai/goal/WrappedGoal;)Z", cancellable = true)
    private void canBeReplacedBy_765519560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765519560L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_523110977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523110977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_523110977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523110977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_523110977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523110977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGoal()Lnet/minecraft/world/entity/ai/goal/Goal;", cancellable = true)
    private void getGoal__1201115541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201115541L))
            info.setReturnValue(null);
    }


}
