package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FoodPredicate.Builder.class)
public class Builder2018429642Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/advancements/predicates/FoodPredicate;", cancellable = true)
    private void build__1082499790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082499790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLevel(Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;)Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private void withLevel__958604888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958604888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "food()Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private static void food__95052541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95052541L))
            info.setReturnValue(new net.minecraft.advancements.predicates.FoodPredicate.Builder());
    }

    @Inject(at = @At("HEAD"), method = "withSaturation(Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;)Lnet/minecraft/advancements/predicates/FoodPredicate$Builder;", cancellable = true)
    private void withSaturation_1176266960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176266960L))
            info.setReturnValue(new net.minecraft.advancements.predicates.FoodPredicate.Builder());
    }


}
