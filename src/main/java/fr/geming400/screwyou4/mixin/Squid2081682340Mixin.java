package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.squid.Squid.class)
public class Squid2081682340Mixin {
        @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__1845548957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845548957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1632252009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632252009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_2119957079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2119957079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_2119960923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119960923L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1005832631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1005832631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1381463895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381463895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_839036296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839036296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__364553018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364553018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__615625334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615625334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMovementVector()Z", cancellable = true)
    private void hasMovementVector_2119960923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119960923L))
            info.setReturnValue(false);
    }


}
