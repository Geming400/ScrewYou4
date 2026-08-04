package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Interaction.class)
public class Interaction1125771460Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_393533345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393533345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1164046199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1164046199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDimensions__116874584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116874584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()F", cancellable = true)
    private void getWidth_1164031319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164031319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastAttacker()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getLastAttacker_393533345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393533345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeHitByProjectile()Z", cancellable = true)
    private void canBeHitByProjectile_1164050043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164050043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipAttackInteraction(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void skipAttackInteraction_674050644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674050644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isIgnoringBlockTriggers()Z", cancellable = true)
    private void isIgnoringBlockTriggers_1164050043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164050043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;", cancellable = true)
    private void getPistonPushReaction__1278316999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278316999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1523446392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1523446392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_676341625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676341625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_1164050043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164050043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()F", cancellable = true)
    private void getHeight_1164031319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164031319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact__1177130134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177130134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHeight(F)V", cancellable = true)
    private void setHeight__1958048931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1958048931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWidth(F)V", cancellable = true)
    private void setWidth__1958048931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1958048931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setResponse(Z)V", cancellable = true)
    private void setResponse__1939578511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1939578511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResponse()Z", cancellable = true)
    private void getResponse_1164050539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164050539L))
            info.setReturnValue(null);
    }


}
