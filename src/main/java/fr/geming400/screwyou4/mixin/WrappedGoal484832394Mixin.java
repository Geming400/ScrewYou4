package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.WrappedGoal.class)
public class WrappedGoal484832394Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__423794370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423794370L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1042183989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042183989L))
            info.setReturnValue(-523363908);
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1141332965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1141332965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPriority()I", cancellable = true)
    private void getPriority_155415446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155415446L))
            info.setReturnValue(1340906150);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2061935739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2061935739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__429607670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429607670L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFlags(Ljava/util/EnumSet;)V", cancellable = true)
    private void setFlags_1779820440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1779820440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_355148736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(355148736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_510699052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510699052L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFlags()Ljava/util/EnumSet;", cancellable = true)
    private void getFlags__515979876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515979876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable__124280594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124280594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1224498144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224498144L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__204802900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204802900L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getGoal()Lnet/minecraft/world/entity/ai/goal/Goal;", cancellable = true)
    private void getGoal_17740162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17740162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedBy(Lnet/minecraft/world/entity/ai/goal/WrappedGoal;)Z", cancellable = true)
    private void canBeReplacedBy_908265934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908265934L))
            info.setReturnValue(true);
    }


}
