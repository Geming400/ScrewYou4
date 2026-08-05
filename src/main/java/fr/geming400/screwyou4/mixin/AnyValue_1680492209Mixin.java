package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AnyValue.class)
public class AnyValue_1680492209Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void type__1346156225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346156225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1228962829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228962829L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_545032233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545032233L))
            info.setReturnValue("lEU5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1718754950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718754950L))
            info.setReturnValue(1188336139);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void matches__780823866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780823866L))
            info.setReturnValue(false);
    }


}
