package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Atom.class)
public class Atom284928679Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__850531792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850531792L))
            info.setReturnValue("vi⪓YuZ2Cy/㬔*!E⋉j疣㷗<t`yv|");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1670440938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670440938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__850531792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850531792L))
            info.setReturnValue("vi⪓YuZ2Cy/㬔*!E⋉j疣㷗<t`yv|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_323191421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323191421L))
            info.setReturnValue(-151784185);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/String;)Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private static void of_122242049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122242049L))
            info.setReturnValue(null);
    }


}
