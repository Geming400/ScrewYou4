package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.DataComponentMatchers.class)
public class DataComponentMatchers_428417002Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__480209267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480209267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1198840526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198840526L))
            info.setReturnValue("^\u1E5BW8\uCEE9TTP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_985769092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985769092L))
            info.setReturnValue(1502930098);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/component/DataComponentGetter;)Z", cancellable = true)
    private void test_551349037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551349037L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1308554710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308554710L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1487533373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487533373L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "exact()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void exact__422910407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422910407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "partial()Ljava/util/Map;", cancellable = true)
    private void partial_162438064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162438064L))
            info.setReturnValue(null);
    }


}
