package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.class)
public class Rabbit_1230334678Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1397925386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397925386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private void getVariant__1434052238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434052238L))
            info.setReturnValue(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.EVIL);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__1433335052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433335052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__1550375420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550375420L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.VOICE);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1984082793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984082793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setJumping(Z)V", cancellable = true)
    private void setJumping_708676164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(708676164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_893046330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(893046330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1689530629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689530629L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle__85572031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85572031L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_1752864841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1752864841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playAttackSound()V", cancellable = true)
    private void playAttackSound_1236824469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1236824469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startJumping()V", cancellable = true)
    private void startJumping__1620315498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1620315498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJumpCompletion(F)F", cancellable = true)
    private void getJumpCompletion__339200242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339200242L))
            info.setReturnValue(1.92192E7F);
    }

    @Inject(at = @At("HEAD"), method = "setSpeedModifier(D)V", cancellable = true)
    private void setSpeedModifier__1544879496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1544879496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkRabbitSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkRabbitSpawnRules_1132548841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132548841L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1370218777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370218777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/rabbit/Rabbit;", cancellable = true)
    private void getBreedOffspring__604715196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604715196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customServerAiStep(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void customServerAiStep__998450671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-998450671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLeashData(Lnet/minecraft/world/entity/Leashable$LeashData;)V", cancellable = true)
    private void setLeashData__1983569133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983569133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1524449676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524449676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1206208265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206208265L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1980432986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980432986L))
            info.setReturnValue(null);
    }


}
