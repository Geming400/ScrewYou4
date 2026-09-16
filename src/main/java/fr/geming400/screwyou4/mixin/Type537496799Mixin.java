package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ConfigurationTask.Type.class)
public class Type537496799Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__371129469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371129469L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1307919828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307919828L))
            info.setReturnValue("i>vK\u5CDCrk8[\u1E2Cp*i{F%uAB7\u7A1CH\uC8A4.`0++cK\u6D8Fv\u6CD3iNj");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1094848890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094848890L))
            info.setReturnValue(219177709);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_878658371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878658371L))
            info.setReturnValue(">Ei|Blcbs\u4358D5ZU{1i5\u2FA0zv;bL^Xb>W9n^Rs6<XY\uFD73E%:7D\u53DBi");
    }


}
