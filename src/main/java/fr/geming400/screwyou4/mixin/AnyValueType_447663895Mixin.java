package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DataComponentPredicate.AnyValueType.class)
public class AnyValueType_447663895Mixin {
        @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_1715982757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715982757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/core/component/predicates/DataComponentPredicate$AnyValueType;", cancellable = true)
    private static void create_55055336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55055336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/AnyValue;", cancellable = true)
    private void predicate_1757197594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757197594L))
            info.setReturnValue(null);
    }


}
