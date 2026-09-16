package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.squid.Squid.class)
public class Squid2081682340Mixin {
        @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1266394487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266394487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__581987389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-581987389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "travel(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void travel__463625603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-463625603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__838182966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838182966L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1459536840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1459536840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__1218073664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218073664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_133610226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133610226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__2073529816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073529816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1463186647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463186647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMovementVector()Z", cancellable = true)
    private void hasMovementVector_353573071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353573071L))
            info.setReturnValue(false);
    }


}
