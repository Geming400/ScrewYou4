package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Marker.class)
public class Marker511748476Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void name_1359323945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359323945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__491772472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491772472L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__396877792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-396877792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1282172001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282172001L))
            info.setReturnValue("Q\u2972 -}s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1069100567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069100567L))
            info.setReturnValue(-1926369517);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_307945639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307945639L))
            info.setReturnValue(true);
    }


}
