package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Illusioner.class)
public class Illusioner1810835942Mixin {
        @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__1245167397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1245167397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1393918456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393918456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIllusionOffsets(F)[Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getIllusionOffsets__538135600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538135600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_1457254028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457254028L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.BOW_AND_ARROW);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__1077873185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1077873185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1110617497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110617497L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1849110681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849110681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__635399416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635399416L))
            info.setReturnValue(null);
    }


}
