package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Silverfish.class)
public class Silverfish835296921Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_705613263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(705613263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_20009068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(20009068L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__2084568385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084568385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setYBodyRot(F)V", cancellable = true)
    private void setYBodyRot__417838752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-417838752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWalkTargetValue(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/LevelReader;)F", cancellable = true)
    private void getWalkTargetValue__705689261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705689261L))
            info.setReturnValue(1.91481E8F);
    }

    @Inject(at = @At("HEAD"), method = "checkSilverfishSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkSilverfishSpawnRules_1686319874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686319874L))
            info.setReturnValue(false);
    }


}
