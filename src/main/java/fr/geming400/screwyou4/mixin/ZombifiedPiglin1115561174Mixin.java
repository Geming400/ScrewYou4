package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.ZombifiedPiglin.class)
public class ZombifiedPiglin1115561174Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1437224505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1437224505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__127084870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127084870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_415342729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415342729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPreventingPlayerRest(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isPreventingPlayerRest__276338279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276338279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction__2142251911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142251911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "populateDefaultEquipmentSlots(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void populateDefaultEquipmentSlots__185551433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-185551433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkZombifiedPiglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkZombifiedPiglinSpawnRules_273297480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273297480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp__900804093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900804093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__1789829301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789829301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget_1978522839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978522839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1964565629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964565629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_1153835913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1153835913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_1153824381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153824381L))
            info.setReturnValue(null);
    }


}
