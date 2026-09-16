package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Sequence.class)
public class Sequence_890112061Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__18514208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18514208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1660535585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660535585L))
            info.setReturnValue("%kD(txp\u24E9]q3/}s6.L%#\u9DA2j\u5005[9\u60F5$xa/!`>ClCm_*&:JW\u960AA\u12D6`J(\uC94CFx\u3633W`wc?H|m7V6\u2BF7J@,V(\uD4EF{Q\u9DC9\u06F5FO HA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1447464151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447464151L))
            info.setReturnValue(-681259558);
    }

    @Inject(at = @At("HEAD"), method = "elements()[Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void elements__743607753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743607753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_686309223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686309223L))
            info.setReturnValue(true);
    }


}
