package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworksPredicate.class)
public class FireworksPredicate_1392007179Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1517447859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517447859L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_256547203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256547203L))
            info.setReturnValue("npG&j8_2n{a9LD*zDu22w\"hz!>`U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1430269920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430269920L))
            info.setReturnValue(-1193833026);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1634641255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634641255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1517319395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517319395L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/Fireworks;)Z", cancellable = true)
    private void matches__848301823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848301823L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "explosions()Ljava/util/Optional;", cancellable = true)
    private void explosions_1637468600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637468600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flightDuration()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void flightDuration_1240772120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240772120L))
            info.setReturnValue(null);
    }


}
