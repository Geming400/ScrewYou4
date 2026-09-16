package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.armadillo.Armadillo.class)
public class Armadillo_1120892425Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/entity/animal/armadillo/Armadillo$ArmadilloState;", cancellable = true)
    private void getState__1174368956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174368956L))
            info.setReturnValue(net.minecraft.world.entity.animal.armadillo.Armadillo.ArmadilloState.IDLE);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_991208766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991208766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_305604571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305604571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAgeScale()F", cancellable = true)
    private void getAgeScale_484676682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484676682L))
            info.setReturnValue(1.650161E8F);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1874640540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1874640540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_934990498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934990498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1798972882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798972882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_2116103716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116103716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1827626772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1827626772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_1442786173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442786173L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "brushOffScute(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void brushOffScute__156041666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-156041666L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldHideInShell()Z", cancellable = true)
    private void shouldHideInShell__261817143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261817143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canStayRolledUp()Z", cancellable = true)
    private void canStayRolledUp_1711958207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711958207L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldSwitchToScaredState()Z", cancellable = true)
    private void shouldSwitchToScaredState_1411944592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411944592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkArmadilloSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkArmadilloSpawnRules__1735252799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735252799L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "switchToState(Lnet/minecraft/world/entity/animal/armadillo/Armadillo$ArmadilloState;)V", cancellable = true)
    private void switchToState_1551882651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551882651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1260647564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260647564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1164919344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164919344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1629339266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629339266L))
            info.setReturnValue(822329377);
    }

    @Inject(at = @At("HEAD"), method = "rollUp()V", cancellable = true)
    private void rollUp_775247811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(775247811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isScared()Z", cancellable = true)
    private void isScared_1172127061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172127061L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rollOut()V", cancellable = true)
    private void rollOut__555792950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555792950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isScaredBy(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isScaredBy__2072972464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072972464L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1096766012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096766012L))
            info.setReturnValue(true);
    }


}
