package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AttributeModifiersPredicate.EntryPredicate.class)
public class EntryPredicate_1459744860Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Ljava/util/Optional;", cancellable = true)
    private void slot_1705206281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705206281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1449710178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449710178L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_324284884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324284884L))
            info.setReturnValue("I$t\u5F4Ac=G\uB9D6\u7FA83tP \u3318h^5kV%\"Snkc!4\u02230\u3FAFk|*jpD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1498007601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498007601L))
            info.setReturnValue(1450704167);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1449581714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449581714L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/component/ItemAttributeModifiers$Entry;)Z", cancellable = true)
    private void test_1400792651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400792651L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id_1705206281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705206281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Ljava/util/Optional;", cancellable = true)
    private void attribute_1705206281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705206281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/advancements/predicates/MinMaxBounds$Doubles;", cancellable = true)
    private void amount_763277497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763277497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operation()Ljava/util/Optional;", cancellable = true)
    private void operation_1705206281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705206281L))
            info.setReturnValue(null);
    }


}
