package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FoodPredicate.Builder.class)
public class Builder2018429642Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/FoodPredicate;", cancellable = true)
    private void build_921924576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921924576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSaturation(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private void withSaturation_986998536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986998536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private void withLevel_372282570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372282570L))
            info.setReturnValue(new net.minecraft.advancements.predicates.FoodPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "food()Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private static void food_1018178977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018178977L))
            info.setReturnValue(new net.minecraft.advancements.predicates.FoodPredicate.Builder());
    }


}
