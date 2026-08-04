package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Rotations.class)
public class Rotations1063702391Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1845752646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845752646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__71757584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-71757584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1101965133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101965133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1101961754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101961754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_1101961754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101961754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1101961754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101961754L))
            info.setReturnValue(null);
    }


}
