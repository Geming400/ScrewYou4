package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.OminousItemSpawner.class)
public class OminousItemSpawner1248544151Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/OminousItemSpawner;", cancellable = true)
    private static void create_1650812925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650812925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1118860493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118860493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_754378820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754378820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_433256794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433256794L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1122410278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122410278L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.IGNORE);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_41475103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41475103L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addParticles()V", cancellable = true)
    private void addParticles__333863746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-333863746L))
            info.cancel();
    }


}
