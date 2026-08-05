package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.MobEffectInstancePredicate.class)
public class MobEffectInstancePredicate_172836580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__735789689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735789689L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943260104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943260104L))
            info.setReturnValue("{TbvtM@C=.js\u6D49gd\u6566E[:(OSq5eOL\u9CC3;!\u9C37qBd(jFPI\u2E46#n DUrv\u72C6C72v\u4C77\"C\u7297dQ;A?X*@dI\u8291\uABD0m'YUUW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_730188670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730188670L))
            info.setReturnValue(-732371541);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void matches__981644771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981644771L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void duration_976287709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976287709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visible()Ljava/util/Optional;", cancellable = true)
    private void visible_930280195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930280195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amplifier()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void amplifier__322498528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322498528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambient()Ljava/util/Optional;", cancellable = true)
    private void ambient_859398953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859398953L))
            info.setReturnValue(null);
    }


}
