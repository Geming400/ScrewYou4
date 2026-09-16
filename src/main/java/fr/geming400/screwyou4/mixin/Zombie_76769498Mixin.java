package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.Zombie.class)
public class Zombie_76769498Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void getType_2111216277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111216277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__52914161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-52914161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__738518356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738518356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBaby()Z", cancellable = true)
    private void isBaby_2050642288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050642288L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1451871487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451871487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killedEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void killedEntity_570519498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570519498L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1071980789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071980789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_992428643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992428643L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_783503845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(783503845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem__1996478829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996478829L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_721549004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721549004L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBaby(Z)V", cancellable = true)
    private void setBaby__514625042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514625042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_826867806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826867806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBreakDoors()Z", cancellable = true)
    private void canBreakDoors_298964890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(298964890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUnderWaterConverting()Z", cancellable = true)
    private void isUnderWaterConverting_1779872120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779872120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnAsBabyOdds(Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void getSpawnAsBabyOdds_810688889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810688889L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setInWaterTime(I)V", cancellable = true)
    private void setInWaterTime_416920930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(416920930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanBreakDoors(Z)V", cancellable = true)
    private void setCanBreakDoors_1210532874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1210532874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setConversionTime(I)V", cancellable = true)
    private void setConversionTime__1991524790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991524790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "convertVillagerToZombieVillager(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/npc/villager/Villager;)Z", cancellable = true)
    private void convertVillagerToZombieVillager_274621258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274621258L))
            info.setReturnValue(false);
    }


}
