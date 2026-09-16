package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.GoalSelector.class)
public class GoalSelector1113497544Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_983813886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(983813886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;)V", cancellable = true)
    private void enableControlFlag__1911167689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1911167689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;Z)V", cancellable = true)
    private void setControlFlag_335329418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335329418L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableGoals()Ljava/util/Set;", cancellable = true)
    private void getAvailableGoals__1052697251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052697251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickRunningGoals(Z)V", cancellable = true)
    private void tickRunningGoals__965066877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-965066877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAllGoals(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeAllGoals__669245465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-669245465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disableControlFlag(Lnet/minecraft/world/entity/ai/goal/Goal$Flag;)V", cancellable = true)
    private void disableControlFlag__1905176612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1905176612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGoal(ILnet/minecraft/world/entity/ai/goal/Goal;)V", cancellable = true)
    private void addGoal__449613566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-449613566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeGoal(Lnet/minecraft/world/entity/ai/goal/Goal;)V", cancellable = true)
    private void removeGoal_861555878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(861555878L))
            info.cancel();
    }


}
