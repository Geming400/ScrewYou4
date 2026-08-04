package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.KineticWeapon.Condition.class)
public class Condition_366950826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1752463084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752463084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__768509150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768509150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_405213567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405213567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(IDDD)Z", cancellable = true)
    private void test_1690979515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690979515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofRelativeSpeed(IF)Ljava/util/Optional;", cancellable = true)
    private static void ofRelativeSpeed__1469424494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469424494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofAttackerSpeed(IF)Ljava/util/Optional;", cancellable = true)
    private static void ofAttackerSpeed__1469424494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469424494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minSpeed()F", cancellable = true)
    private void minSpeed_405210188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405210188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minRelativeSpeed()F", cancellable = true)
    private void minRelativeSpeed_405210188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405210188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDurationTicks()I", cancellable = true)
    private void maxDurationTicks_405213071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405213071L))
            info.setReturnValue(null);
    }


}
