package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShowTradesToPlayer.class)
public class ShowTradesToPlayer1405210304Mixin {
        @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void start_482786574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482786574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void start_1289900243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289900243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void stop_1289900243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289900243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void stop_482786574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482786574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tick_482786574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482786574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)V", cancellable = true)
    private void tick_1289900243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1289900243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkExtraStartConditions(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void checkExtraStartConditions__564992970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564992970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkExtraStartConditions(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;)Z", cancellable = true)
    private void checkExtraStartConditions_1816222801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816222801L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStillUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;J)Z", cancellable = true)
    private void canStillUse_1289904087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289904087L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStillUse(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void canStillUse_482790418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482790418L))
            info.setReturnValue(true);
    }


}
