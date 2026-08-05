package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FoodPredicate.class)
public class FoodPredicate_572031557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1957543815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957543815L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__563428419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563428419L))
            info.setReturnValue("}\uD332\uB021;y\u5717Zy^^!\u6E57U:&T`|*sk9cd\u3F6F\u4B59xxzBlTs$r\u29C5#R1X\"\u530E*.6fpS\u50E4zx BVCr\uD1AEnZC?\u2503");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_610294298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610294298L))
            info.setReturnValue(576182231);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/food/FoodData;)Z", cancellable = true)
    private void matches_681654762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681654762L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level_420796498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420796498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saturation()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void saturation__124435806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-124435806L))
            info.setReturnValue(null);
    }


}
