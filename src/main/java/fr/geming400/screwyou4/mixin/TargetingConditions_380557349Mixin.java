package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.targeting.TargetingConditions.class)
public class TargetingConditions_380557349Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void test__42148710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42148710L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void copy__935051500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935051500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "range(D)Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void range_1885778650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885778650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selector(Lnet/minecraft/world/entity/ai/targeting/TargetingConditions$Selector;)Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void selector__311377387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311377387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forCombat()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private static void forCombat_1254418276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254418276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreInvisibilityTesting()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void ignoreInvisibilityTesting_510474210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510474210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreLineOfSight()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private void ignoreLineOfSight__545442391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545442391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forNonCombat()Lnet/minecraft/world/entity/ai/targeting/TargetingConditions;", cancellable = true)
    private static void forNonCombat__991635831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991635831L))
            info.setReturnValue(null);
    }


}
