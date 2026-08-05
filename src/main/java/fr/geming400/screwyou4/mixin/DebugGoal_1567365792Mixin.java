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
            info.setReturnValue("8<P*n1Buz;ioU\"S8\u1748ZC  5<!/4vBSy[32\u2DB5\u765ChH[;ZWDr{#j_HR7g1JyPmY@OdYK@KR\u1BAE&/o{3iE\"?%v{=D}x3<\u0E2B@O$ tn");
    }

    @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_1605628037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628037L))
            info.setReturnValue(1033782953);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1342089246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342089246L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_431905816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431905816L))
            info.setReturnValue("\u3759h_lB6m%(S+)H9C\uBDABG.J\u7ED9*,!X6'\u0800pzlWIL\uC129\u8C48C\uD56A M]h*='8,<\u591C\uC59C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1605628533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605628533L))
            info.setReturnValue(756763745);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1605644374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605644374L))
            info.setReturnValue(false);
    }


}
