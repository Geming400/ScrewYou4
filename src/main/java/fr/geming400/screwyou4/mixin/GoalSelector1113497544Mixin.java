package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.GoalSelector.class)
public class GoalSelector1113497544Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1151772283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1151772283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeGoal(Lnet/minecraft/world/entity/ai/goal/Goal;)V", cancellable = true)
    private void removeGoal__251942097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-251942097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGoal(ILnet/minecraft/world/entity/ai/goal/Goal;)V", cancellable = true)
    private void addGoal_880469718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880469718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;)V", cancellable = true)
    private void enableControlFlag_1587386333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587386333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableGoals()Ljava/util/Set;", cancellable = true)
    private void getAvailableGoals__715537942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715537942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;)V", cancellable = true)
    private void disableControlFlag_1587386333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1587386333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;Z)V", cancellable = true)
    private void setControlFlag__1332719261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1332719261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickRunningGoals(Z)V", cancellable = true)
    private void tickRunningGoals__1951852923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1951852923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAllGoals(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeAllGoals_1183854090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1183854090L))
            info.cancel();
    }


}
