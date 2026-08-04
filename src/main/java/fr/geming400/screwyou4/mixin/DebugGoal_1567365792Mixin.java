package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGoalInfo.DebugGoal.class)
public class DebugGoal_1567365792Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_431905320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431905320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1605628037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1342089246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342089246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_431905816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431905816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1605628533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1605644374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605644374L))
            info.setReturnValue(null);
    }


}
