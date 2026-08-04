package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagSet.class)
public class FeatureFlagSet_974540022Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1934915512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934915512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1012802267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012802267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of_1639360767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639360767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/flag/FeatureFlag;[Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of__677271574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677271574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of_740100862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740100862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1012818604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012818604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void join_839957676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839957676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/flag/FeatureFlag;)Z", cancellable = true)
    private void contains__1095372885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095372885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void subtract_839957676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839957676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void intersects__455229359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455229359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSubsetOf(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isSubsetOf__455229359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455229359L))
            info.setReturnValue(null);
    }


}
