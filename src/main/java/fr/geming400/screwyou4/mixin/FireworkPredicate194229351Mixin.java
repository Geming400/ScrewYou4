package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworkExplosionPredicate.FireworkPredicate.class)
public class FireworkPredicate194229351Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1579741610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579741610L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__941230624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941230624L))
            info.setReturnValue("\uA6F6\u5983g&LXH`0\uC564]SKX\u37D9(&m\u5D6B,\uB16DL0&nug D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_232492093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(232492093L))
            info.setReturnValue(879747380);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/item/component/FireworkExplosion;)Z", cancellable = true)
    private void test_2105867292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105867292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1579870074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579870074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shape()Ljava/util/Optional;", cancellable = true)
    private void shape_439690773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439690773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trail()Ljava/util/Optional;", cancellable = true)
    private void trail_439690773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439690773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "twinkle()Ljava/util/Optional;", cancellable = true)
    private void twinkle_439690773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439690773L))
            info.setReturnValue(null);
    }


}
