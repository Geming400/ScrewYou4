package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Llama.class)
public class Llama1956523207Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__671736856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671736856L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getStrength()I", cancellable = true)
    private void getStrength__1354928298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354928298L))
            info.setReturnValue(1523937334);
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/world/entity/animal/equine/Llama$Variant;", cancellable = true)
    private void getVariant_366782350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366782350L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Llama.Variant.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__963342099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963342099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1343232797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343232797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage__1030336920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030336920L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "supportQuadLeash()Z", cancellable = true)
    private void supportQuadLeash_2108796055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108796055L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__798261146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798261146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isImmobile()Z", cancellable = true)
    private void isImmobile__1094241682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1094241682L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canUseSlot(Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private void canUseSlot_2032096679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032096679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_2096407307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096407307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/equine/Llama;", cancellable = true)
    private void getBreedOffspring__495930786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495930786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInventoryColumns()I", cancellable = true)
    private void getInventoryColumns__741350730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741350730L))
            info.setReturnValue(1118338681);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1932396795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932396795L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canMate(Lnet/minecraft/world/entity/animal/Animal;)Z", cancellable = true)
    private void canMate_1585163716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585163716L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performRangedAttack(Lnet/minecraft/world/entity/LivingEntity;F)V", cancellable = true)
    private void performRangedAttack__955510576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-955510576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxTemper()I", cancellable = true)
    private void getMaxTemper__52385602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52385602L))
            info.setReturnValue(1552432867);
    }

    @Inject(at = @At("HEAD"), method = "joinCaravan(Lnet/minecraft/world/entity/animal/equine/Llama;)V", cancellable = true)
    private void joinCaravan__188264664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-188264664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "leaveCaravan()V", cancellable = true)
    private void leaveCaravan__860827493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-860827493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTraderLlama()Z", cancellable = true)
    private void isTraderLlama_206461665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206461665L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canEatGrass()Z", cancellable = true)
    private void canEatGrass_567548432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567548432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasCaravanTail()Z", cancellable = true)
    private void hasCaravanTail_554017426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554017426L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCaravanHead()Lnet/minecraft/world/entity/animal/equine/Llama;", cancellable = true)
    private void getCaravanHead_1362256352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362256352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1588345780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588345780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inCaravan()Z", cancellable = true)
    private void inCaravan__1532008179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532008179L))
            info.setReturnValue(false);
    }


}
