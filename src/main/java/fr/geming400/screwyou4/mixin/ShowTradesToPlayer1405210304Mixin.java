package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShowTradesToPlayer.class)
public class ShowTradesToPlayer1405210304Mixin {
        @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void start_257833580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(257833580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void start__480314059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-480314059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void stop_1579598037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579598037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void stop__1925324084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1925324084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tick_334123729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(334123729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void tick_2145879664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145879664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkExtraStartConditions(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void checkExtraStartConditions__887247256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887247256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkExtraStartConditions(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;)Z", cancellable = true)
    private void checkExtraStartConditions__330175905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330175905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canStillUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)Z", cancellable = true)
    private void canStillUse_722020998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722020998L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStillUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void canStillUse_1661169795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661169795L))
            info.setReturnValue(true);
    }


}
