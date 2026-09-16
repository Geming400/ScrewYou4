package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.KineticWeapon.Condition.class)
public class Condition_366950826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__541675443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541675443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1137374350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137374350L))
            info.setReturnValue("<z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_924302916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924302916L))
            info.setReturnValue(-1076921623);
    }

    @Inject(at = @At("HEAD"), method = "test(IDDD)Z", cancellable = true)
    private void test_356715625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356715625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "minSpeed()F", cancellable = true)
    private void minSpeed_1596152919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596152919L))
            info.setReturnValue(1.696865E8F);
    }

    @Inject(at = @At("HEAD"), method = "ofAttackerSpeed(IF)Ljava/util/Optional;", cancellable = true)
    private static void ofAttackerSpeed__774420339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774420339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofRelativeSpeed(IF)Ljava/util/Optional;", cancellable = true)
    private static void ofRelativeSpeed__1529390122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529390122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDurationTicks()I", cancellable = true)
    private void maxDurationTicks__1238247407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238247407L))
            info.setReturnValue(-1031551861);
    }

    @Inject(at = @At("HEAD"), method = "minRelativeSpeed()F", cancellable = true)
    private void minRelativeSpeed__491449789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491449789L))
            info.setReturnValue(1.696865E8F);
    }


}
