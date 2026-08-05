package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.class)
public class Bee_1781858124Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1820132862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820132862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTravellingTicks()I", cancellable = true)
    private void getTravellingTicks_1820120369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820120369L))
            info.setReturnValue(-150676050);
    }

    @Inject(at = @At("HEAD"), method = "getBlacklistedHives()Ljava/util/List;", cancellable = true)
    private void getBlacklistedHives__886772357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886772357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRollAmount(F)F", cancellable = true)
    private void getRollAmount__1301978140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301978140L))
            info.setReturnValue(7.364381E8F);
    }

    @Inject(at = @At("HEAD"), method = "hasStung()Z", cancellable = true)
    private void hasStung_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHivePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHivePos__111528756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111528756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasHive()Z", cancellable = true)
    private void hasHive_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1332427792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332427792L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetTicksWithoutNectarSinceExitingHive()V", cancellable = true)
    private void resetTicksWithoutNectarSinceExitingHive_1820132862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820132862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__869069462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869069462L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSavedFlowerPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setSavedFlowerPos_1950624722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950624722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropOffNectar()V", cancellable = true)
    private void dropOffNectar_1820132862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820132862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSavedFlowerPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getSavedFlowerPos__111528756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111528756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStayOutOfHiveCountdown(I)V", cancellable = true)
    private void setStayOutOfHiveCountdown__1299192201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1299192201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasSavedFlowerPos()Z", cancellable = true)
    private void hasSavedFlowerPos_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_1820132862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820132862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_1820121330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820121330L))
            info.setReturnValue(953984944910426813L);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__1123532352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1123532352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget__1650147508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650147508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1298268680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298268680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues__1284832081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1284832081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1081639678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081639678L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier$Builder());
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__896283331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896283331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_1996169094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996169094L))
            info.setReturnValue(7.364381E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/bee/Bee;", cancellable = true)
    private void getBreedOffspring_2139762326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139762326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__915320591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915320591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1820132862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820132862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__1415379644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415379644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood__778574041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778574041L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setHivePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHivePos_1950624722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950624722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasNectar()Z", cancellable = true)
    private void hasNectar_1820136706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820136706L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "attractsBees(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void attractsBees_1636569385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636569385L))
            info.setReturnValue(true);
    }


}
