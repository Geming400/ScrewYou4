package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Vex.class)
public class Vex_2092693477Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner_1360455361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360455361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__373256406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373256406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void setOwner__1698562175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1698562175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2130968215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130968215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlapping()Z", cancellable = true)
    private void isFlapping_2130972059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130972059L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__353541882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353541882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom_1640968816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1640968816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1392475031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392475031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwnerReference()Lnet/minecraft/world/entity/EntityReference;", cancellable = true)
    private void getOwnerReference__1339312155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339312155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_2130952839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130952839L))
            info.setReturnValue(9.612839E8F);
    }

    @Inject(at = @At("HEAD"), method = "isCharging()Z", cancellable = true)
    private void isCharging_2130972059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130972059L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBoundOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBoundOrigin_199306597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199306597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIsCharging(Z)V", cancellable = true)
    private void setIsCharging__972656991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-972656991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLimitedLife(I)V", cancellable = true)
    private void setLimitedLife__988356848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988356848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBoundOrigin(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setBoundOrigin__2033507221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2033507221L))
            info.cancel();
    }


}
