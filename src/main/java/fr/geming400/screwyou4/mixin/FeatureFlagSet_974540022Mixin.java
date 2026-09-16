package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagSet.class)
public class FeatureFlagSet_974540022Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_65913257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65913257L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1531891616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531891616L))
            info.setReturnValue(-1415963747);
    }

    @Inject(at = @At("HEAD"), method = "of()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of_927968392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927968392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/flag/FeatureFlag;[Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of_1347564289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347564289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/flag/FeatureFlag;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private static void of__1688199225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688199225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_2033656393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033656393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void join_999272022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999272022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/flag/FeatureFlag;)Z", cancellable = true)
    private void contains_966491180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966491180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void subtract_1214443712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214443712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void intersects__1798798203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798798203L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSubsetOf(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isSubsetOf__1565904396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565904396L))
            info.setReturnValue(false);
    }


}
