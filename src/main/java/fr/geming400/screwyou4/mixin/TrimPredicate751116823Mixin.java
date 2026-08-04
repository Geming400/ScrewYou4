package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.TrimPredicate.class)
public class TrimPredicate751116823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2136629082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136629082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__384343152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384343152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_789379565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789379565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_2019435686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019435686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches_2136757546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136757546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/equipment/trim/ArmorTrim;)Z", cancellable = true)
    private void matches__530561979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530561979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/util/Optional;", cancellable = true)
    private void pattern_996578245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996578245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "material()Ljava/util/Optional;", cancellable = true)
    private void material_996578245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996578245L))
            info.setReturnValue(null);
    }


}
