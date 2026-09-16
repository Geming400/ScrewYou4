package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Interaction.class)
public class Interaction1125771460Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1089172090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089172090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_996087802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(996087802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_118521332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118521332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__426762922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426762922L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_310484103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(310484103L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastAttacker()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getLastAttacker__1313309408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313309408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipAttackInteraction(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void skipAttackInteraction_2119835199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119835199L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions_1776990123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776990123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeHitByProjectile()Z", cancellable = true)
    private void canBeHitByProjectile__1489738149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489738149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1245182969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245182969L))
            info.setReturnValue(net.minecraft.world.level.material.PushReaction.BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers__81297588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81297588L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1832505808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832505808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()F", cancellable = true)
    private void getHeight__599848102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599848102L))
            info.setReturnValue(4.385404E8F);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()F", cancellable = true)
    private void getWidth__812127417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-812127417L))
            info.setReturnValue(4.385404E8F);
    }

    @Inject(at = @At("HEAD"), method = "setHeight(F)V", cancellable = true)
    private void setHeight_107016390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107016390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWidth(F)V", cancellable = true)
    private void setWidth__566196511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-566196511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResponse()Z", cancellable = true)
    private void getResponse_1631725844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631725844L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setResponse(Z)V", cancellable = true)
    private void setResponse__1266698764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1266698764L))
            info.cancel();
    }


}
