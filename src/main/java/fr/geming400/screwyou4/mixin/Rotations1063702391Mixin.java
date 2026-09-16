package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Rotations.class)
public class Rotations1063702391Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_155076123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155076123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1834125916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834125916L))
            info.setReturnValue("dM!WK<B>[8=Gl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1621054482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621054482L))
            info.setReturnValue(-1019451295);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_242492578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242492578L))
            info.setReturnValue(8.682659E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_299750880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299750880L))
            info.setReturnValue(8.682659E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_271121729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271121729L))
            info.setReturnValue(8.682659E8F);
    }


}
