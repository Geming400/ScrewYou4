package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.class)
public class Rabbit_1230334678Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1067242272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067242272L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private void getVariant__976719007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976719007L))
            info.setReturnValue(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.WHITE_SPLOTCHED);
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_1268609416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268609416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1268609416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268609416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setJumping(Z)V", cancellable = true)
    private void setJumping__1835015790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1835015790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_1268609416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268609416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle_1268613260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268613260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1857180294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1857180294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_530116232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530116232L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_1268609416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268609416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1062713296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062713296L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.BLOCKS);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1330097487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330097487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setLeashData(Lnet/minecraft/world/entity/Leashable$LeashData;)V", cancellable = true)
    private void setLeashData__1215530152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1215530152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1966903090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966903090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1466844037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466844037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/rabbit/Rabbit;", cancellable = true)
    private void getBreedOffspring_1024544806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1024544806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep_251925337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(251925337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkRabbitSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkRabbitSpawnRules_388070983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388070983L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSpeedModifier(D)V", cancellable = true)
    private void setSpeedModifier__1855333252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1855333252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startJumping()V", cancellable = true)
    private void startJumping_1268609416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268609416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJumpCompletion(F)F", cancellable = true)
    private void getJumpCompletion__1853501586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853501586L))
            info.setReturnValue(9.068787E8F);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1215900681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215900681L))
            info.setReturnValue(null);
    }


}
