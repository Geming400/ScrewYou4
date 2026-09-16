package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.class)
public class Bee_1781858124Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1652174465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1652174465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_966570270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966570270L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__881811606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-881811606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_1671992817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671992817L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1138007183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138007183L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget__1597450027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597450027L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "registerDebugValues(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/debug/DebugValueSource$Registration;)V", cancellable = true)
    private void registerDebugValues_1322770749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1322770749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRollAmount(F)F", cancellable = true)
    private void getRollAmount_1339783887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1339783887L))
            info.setReturnValue(3.062684E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlacklistedHives()Ljava/util/List;", cancellable = true)
    private void getBlacklistedHives__1466175912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466175912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTravellingTicks()I", cancellable = true)
    private void getTravellingTicks__1903402207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903402207L))
            info.setReturnValue(1528497115);
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerEndTime(J)V", cancellable = true)
    private void setPersistentAngerEndTime__1412527630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1412527630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPersistentAngerTimer()V", cancellable = true)
    private void startPersistentAngerTimer_406859623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(406859623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPersistentAngerTarget(Lnet/minecraft/world/entity/EntityReference;)V", cancellable = true)
    private void setPersistentAngerTarget__1740422783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1740422783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerTarget()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getPersistentAngerTarget_362399991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362399991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPersistentAngerEndTime()J", cancellable = true)
    private void getPersistentAngerEndTime_156621380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156621380L))
            info.setReturnValue(-1150307179837261871L);
    }

    @Inject(at = @At("HEAD"), method = "hasSavedFlowerPos()Z", cancellable = true)
    private void hasSavedFlowerPos__693127146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693127146L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "dropOffNectar()V", cancellable = true)
    private void dropOffNectar_11919077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(11919077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSavedFlowerPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getSavedFlowerPos_1670354340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670354340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setStayOutOfHiveCountdown(I)V", cancellable = true)
    private void setStayOutOfHiveCountdown__1198532274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1198532274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSavedFlowerPos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setSavedFlowerPos_2067811078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2067811078L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/bee/Bee;", cancellable = true)
    private void getBreedOffspring_262460468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262460468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_1921742223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921742223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue_240871941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240871941L))
            info.setReturnValue(3.062684E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void mobInteract__503953645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503953645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLeashOffset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLeashOffset__972926230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972926230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attractsBees(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void attractsBees_1528482534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528482534L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying__1796136887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796136887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFood(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFood_1757731711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757731711L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setHivePos(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setHivePos__457467564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-457467564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasNectar()Z", cancellable = true)
    private void hasNectar__134872305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134872305L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasHive()Z", cancellable = true)
    private void hasHive_291583512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291583512L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHivePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getHivePos__900932098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900932098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasStung()Z", cancellable = true)
    private void hasStung_1714407535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714407535L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetTicksWithoutNectarSinceExitingHive()V", cancellable = true)
    private void resetTicksWithoutNectarSinceExitingHive_1468902410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468902410L))
            info.cancel();
    }


}
