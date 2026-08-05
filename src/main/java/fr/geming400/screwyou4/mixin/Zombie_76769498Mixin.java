package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.Zombie.class)
public class Zombie_76769498Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void getType_2118680645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118680645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_115044236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(115044236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__372660834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372660834L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertVillagerToZombieVillager(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;)Z", cancellable = true)
    private void convertVillagerToZombieVillager_487781994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487781994L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1720809208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1720809208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "killedEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void killedEntity_1760288394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760288394L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1722518941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1722518941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__623448948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623448948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1165876547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165876547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem_1811304629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811304629L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__1939595770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939595770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_115048080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115048080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby_1306386326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306386326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBreakDoors()Z", cancellable = true)
    private void canBreakDoors_115048080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115048080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isUnderWaterConverting()Z", cancellable = true)
    private void isUnderWaterConverting_115048080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115048080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnAsBabyOdds(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void getSpawnAsBabyOdds__1630241496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630241496L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCanBreakDoors(Z)V", cancellable = true)
    private void setCanBreakDoors_1306386326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306386326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setConversionTime(I)V", cancellable = true)
    private void setConversionTime_1290686469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290686469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInWaterTime(I)V", cancellable = true)
    private void setInWaterTime_1290686469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290686469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1925501435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925501435L))
            info.setReturnValue(null);
    }


}
