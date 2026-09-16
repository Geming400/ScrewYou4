package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FoodPredicate.class)
public class FoodPredicate_572031557Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__336594712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336594712L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1342455081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342455081L))
            info.setReturnValue("<^\uC50A\u68912X]m]>W-?,Ksc2IbmM\uA3AB3.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1129383647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129383647L))
            info.setReturnValue(-1955542856);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/food/FoodData;)Z", cancellable = true)
    private void matches_531321885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531321885L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level_1952099150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952099150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saturation()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void saturation_1552985716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552985716L))
            info.setReturnValue(null);
    }


}
