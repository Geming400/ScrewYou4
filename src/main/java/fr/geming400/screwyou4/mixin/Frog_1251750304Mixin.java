package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.Frog.class)
public class Frog_1251750304Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1088657898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088657898L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_519512188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519512188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1290025042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290025042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1494341221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494341221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__1308681861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308681861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canEat(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canEat_1573417726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573417726L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__1450240135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450240135L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid_1290028886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290028886L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1397467549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1397467549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_551531858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551531858L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1194485055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194485055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__1445557371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445557371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1290012549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290012549L))
            info.setReturnValue(-415612626);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRotSpeed()I", cancellable = true)
    private void getHeadRotSpeed_1290012549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290012549L))
            info.setReturnValue(-415612626);
    }

    @Inject(at = @At("HEAD"), method = "spawnChildFromBreeding(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/Animal;)V", cancellable = true)
    private void spawnChildFromBreeding__518694978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-518694978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playEatingSound()V", cancellable = true)
    private void playEatingSound_1290025042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290025042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTongueTarget()Ljava/util/Optional;", cancellable = true)
    private void getTongueTarget_1497211725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497211725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkFrogSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkFrogSpawnRules_409486609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409486609L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "eraseTongueTarget()V", cancellable = true)
    private void eraseTongueTarget_1290025042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1290025042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTongueTarget(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setTongueTarget_800025643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800025643L))
            info.cancel();
    }


}
