package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DataComponentPredicate.AnyValueType.class)
public class AnyValueType_447663895Mixin {
        @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__2130788868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130788868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/predicates/DataComponentPredicate$AnyValueType;", cancellable = true)
    private static void create__919973268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919973268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/AnyValue;", cancellable = true)
    private void predicate_1467191185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467191185L))
            info.setReturnValue(null);
    }


}
