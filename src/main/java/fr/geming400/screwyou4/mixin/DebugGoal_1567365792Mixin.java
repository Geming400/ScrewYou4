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
            info.setReturnValue("8<P*n1Buz;ioU\"S8ᝈZC  5<!/4vBSy[32ⶵ癜hH[;ZWDr{#j_HR7g1JyPmY@OdYK@KRᮮ&/o{3iE\"?%v{=D}x3<ห@O$ tn");
    }

    @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1605628037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628037L))
            info.setReturnValue(1273706353);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1342089246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342089246L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_431905816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431905816L))
            info.setReturnValue("㝙h_lB6m%(S+)H9C붫G.J给*,!X6'ࠀpzlWIL섩豈C핪 M]h*='8,<夜얜");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1605628533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628533L))
            info.setReturnValue(996687145);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1605644374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605644374L))
            info.setReturnValue(false);
    }


}
