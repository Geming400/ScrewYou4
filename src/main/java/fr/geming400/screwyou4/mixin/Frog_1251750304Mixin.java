package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.Frog.class)
public class Frog_1251750304Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1376509760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376509760L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getTarget()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getTarget_1215150933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215150933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1122066645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122066645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariant()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getVariant__1214377108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214377108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1668115003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668115003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPushedByFluid()Z", cancellable = true)
    private void isPushedByFluid__1506379226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506379226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1958484651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1958484651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canEat(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private static void canEat__2007041434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007041434L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_1065848377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1065848377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playEatingSound()V", cancellable = true)
    private void playEatingSound__1692053215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1692053215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnChildFromBreeding(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/animal/Animal;)V", cancellable = true)
    private void spawnChildFromBreeding__1675164955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1675164955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1391505443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391505443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxHeadYRot()I", cancellable = true)
    private void getMaxHeadYRot_1760197145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760197145L))
            info.setReturnValue(-1040993164);
    }

    @Inject(at = @At("HEAD"), method = "getHeadRotSpeed()I", cancellable = true)
    private void getHeadRotSpeed_1964901919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964901919L))
            info.setReturnValue(-1516461749);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_2001848612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001848612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1227623891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227623891L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTongueTarget(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setTongueTarget__357094302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-357094302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkFrogSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkFrogSpawnRules__1207945751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207945751L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTongueTarget()Ljava/util/Optional;", cancellable = true)
    private void getTongueTarget_1939282552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939282552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eraseTongueTarget()V", cancellable = true)
    private void eraseTongueTarget_1616845239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616845239L))
            info.cancel();
    }


}
