package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Llama.class)
public class Llama1956523207Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1793430802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793430802L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getStrength()I", cancellable = true)
    private void getStrength_1994785453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994785453L))
            info.setReturnValue(221077755);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private void getVariant_520082367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520082367L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Llama.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "inCaravan()Z", cancellable = true)
    private void inCaravan_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_1478382229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478382229L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isImmobile()Z", cancellable = true)
    private void isImmobile_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot__1343076228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343076228L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1256304762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256304762L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_713877163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713877163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__603908957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603908957L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate__1776380583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776380583L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getInventoryColumns()I", cancellable = true)
    private void getInventoryColumns_1994785453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994785453L))
            info.setReturnValue(221584855);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1240714560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240714560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeash()Z", cancellable = true)
    private void supportQuadLeash_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__740655507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740655507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/equine/Llama;", cancellable = true)
    private void getBreedOffspring__720468676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720468676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__932185920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-932185920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "leaveCaravan()V", cancellable = true)
    private void leaveCaravan_1994797946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1994797946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCaravanHead()Lnet/minecraft/world/entity/animal/equine/Llama;", cancellable = true)
    private void getCaravanHead_2036715296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036715296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTraderLlama()Z", cancellable = true)
    private void isTraderLlama_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasCaravanTail()Z", cancellable = true)
    private void hasCaravanTail_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxTemper()I", cancellable = true)
    private void getMaxTemper_1994785453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994785453L))
            info.setReturnValue(221584855);
    }

    @Inject(at = @At("HEAD"), method = "joinCaravan(Lnet/minecraft/world/entity/animal/equine/Llama;)V", cancellable = true)
    private void joinCaravan__1025560556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1025560556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canEatGrass()Z", cancellable = true)
    private void canEatGrass_1994801790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994801790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__489712151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489712151L))
            info.setReturnValue(null);
    }


}
