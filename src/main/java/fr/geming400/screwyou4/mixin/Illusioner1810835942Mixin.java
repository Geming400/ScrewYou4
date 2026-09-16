package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Illusioner.class)
public class Illusioner1810835942Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__852833787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-852833787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1109029364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109029364L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1101197841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1101197841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_910149845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910149845L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.CROSSED);
    }

    @Inject(at = @At("HEAD"), method = "getIllusionOffsets(F)[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getIllusionOffsets__454402233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454402233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1734033045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734033045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_838363795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(838363795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__870724022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870724022L))
            info.setReturnValue(null);
    }


}
