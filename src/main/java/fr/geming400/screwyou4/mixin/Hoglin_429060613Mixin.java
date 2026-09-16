package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.hoglin.Hoglin.class)
public class Hoglin_429060613Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_392461242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(392461242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__386227241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386227241L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_2060358179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2060358179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1804162602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804162602L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource_1943317811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943317811L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.PLAYERS);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1182808728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182808728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1344719758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344719758L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1424271904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424271904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldDropExperience()Z", cancellable = true)
    private void shouldDropExperience_1641899247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641899247L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1519011502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519011502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_243158686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243158686L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "isAdult()Z", cancellable = true)
    private void isAdult__1462638837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462638837L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTimeInOverworld(I)V", cancellable = true)
    private void setTimeInOverworld_65050490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(65050490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeHunted()Z", cancellable = true)
    private void canBeHunted__832658090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832658090L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkHoglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkHoglinSpawnRules_1608518529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608518529L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationRemainingTicks()I", cancellable = true)
    private void getAttackAnimationRemainingTicks_2076991492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076991492L))
            info.setReturnValue(1210107459);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_750954361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750954361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_568815752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568815752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__1111925570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111925570L))
            info.setReturnValue(6.169743E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__1856751156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856751156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway__229469098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229469098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1179158921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179158921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_404934200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404934200L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isConverting()Z", cancellable = true)
    private void isConverting__1110361790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110361790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setImmuneToZombification(Z)V", cancellable = true)
    private void setImmuneToZombification__877194539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-877194539L))
            info.cancel();
    }


}
