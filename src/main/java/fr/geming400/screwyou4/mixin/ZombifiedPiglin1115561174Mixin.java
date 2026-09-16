package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.zombie.ZombifiedPiglin.class)
public class ZombifiedPiglin1115561174Mixin {
        @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1257966988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257966988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1804304132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804304132L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_2110772466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110772466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPreventingPlayerRest(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void isPreventingPlayerRest_1131366960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131366960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "populateDefaultEquipmentSlots(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/DifficultyInstance;)V", cancellable = true)
    private void populateDefaultEquipmentSlots_539319381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539319381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkZombifiedPiglinSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkZombifiedPiglinSpawnRules_2079679792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079679792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__2078824579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2078824579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer__259437326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-259437326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget_1888247564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888247564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__303896958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303896958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime__509675569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509675569L))
            info.setReturnValue(-7842388999955275809L);
    }

    @Inject(at = @At("HEAD"), method = "wantsToPickUp(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void wantsToPickUp_1760340681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760340681L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawnObstruction(Lnet/minecraft/world/level/LevelReader;)Z", cancellable = true)
    private void checkSpawnObstruction_1947043654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947043654L))
            info.setReturnValue(true);
    }


}
