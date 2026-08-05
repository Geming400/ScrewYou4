package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.hoglin.Hoglin.class)
public class Hoglin_429060613Mixin {
        @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget__303177503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303177503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttackAnimationRemainingTicks()I", cancellable = true)
    private void getAttackAnimationRemainingTicks_467322858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467322858L))
            info.setReturnValue(-1423856013);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__2131371552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131371552L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__20369719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20369719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_467335351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(467335351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_2022037470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022037470L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1636512937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636512937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__271157833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271157833L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__813585432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813585432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldDropExperience()Z", cancellable = true)
    private void shouldDropExperience_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_2073100323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073100323L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1863987361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863987361L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.UI);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2017174746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017174746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAdult()Z", cancellable = true)
    private void isAdult_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2026720234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026720234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract_2045886454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045886454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_643371583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643371583L))
            info.setReturnValue(3.167421E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeWhenFarAway(D)Z", cancellable = true)
    private void removeWhenFarAway_1638363823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638363823L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canFallInLove()Z", cancellable = true)
    private void canFallInLove_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkHoglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkHoglinSpawnRules__413203082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413203082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setTimeInOverworld(I)V", cancellable = true)
    private void setTimeInOverworld_1642977584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642977584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeHunted()Z", cancellable = true)
    private void canBeHunted_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setImmuneToZombification(Z)V", cancellable = true)
    private void setImmuneToZombification_1658677441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658677441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isConverting()Z", cancellable = true)
    private void isConverting_467339195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467339195L))
            info.setReturnValue(true);
    }


}
