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
            info.setReturnValue("}팲뀡;y圗Zy^^!湗U:&T`|*sk9cd㽯䭙xxzBlTs$r⧅#R1X\"匎*.6fpS僤zx BVCr톮nZC?┃");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_610294298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610294298L))
            info.setReturnValue(1086128331);
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
