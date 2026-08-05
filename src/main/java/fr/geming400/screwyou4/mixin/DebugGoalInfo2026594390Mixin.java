package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGoalInfo.class)
public class DebugGoalInfo2026594390Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__882860647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882860647L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_891134415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891134415L))
            info.setReturnValue("Y+踼kU:OqCLDVRIO!4:tmaDc72,:ca(92`⠉-P{QOꊬE%i5뇉hx9QheTD >;KRJH@h4mv㖲aり*RꍙH3j=5,cg:7Q箘*䇙嘛NiXdu;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2064857132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064857132L))
            info.setReturnValue(1758940160);
    }

    @Inject(at = @At("HEAD"), method = "goals()Ljava/util/List;", cancellable = true)
    private void goals__642036090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642036090L))
            info.setReturnValue(null);
    }


}
