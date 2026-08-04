package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.Input.class)
public class Input_246290228Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1631802486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631802486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__889169748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889169748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_284552969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284552969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__889170244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889170244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "control()Lnet/minecraft/server/dialog/input/InputControl;", cancellable = true)
    private void control_2007998234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007998234L))
            info.setReturnValue(null);
    }


}
