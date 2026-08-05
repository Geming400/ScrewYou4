package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.targeting.TargetingConditions.class)
public class TargetingConditions_380557349Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void test_2142755692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142755692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void copy_1290524649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290524649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "range(D)Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void range_1699364061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699364061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selector(Lnet/minecraft/world/entity/ai/targeting/TargetingConditions$Selector;)Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void selector_890048212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890048212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forCombat()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private static void forCombat_1290524897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290524897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreInvisibilityTesting()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void ignoreInvisibilityTesting_1290524649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290524649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forNonCombat()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private static void forNonCombat_1290524897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290524897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreLineOfSight()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void ignoreLineOfSight_1290524649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290524649L))
            info.setReturnValue(null);
    }


}
