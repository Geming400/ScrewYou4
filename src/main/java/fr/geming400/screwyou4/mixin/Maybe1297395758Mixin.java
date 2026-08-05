package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Maybe.class)
public class Maybe1297395758Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1612059279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612059279L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_161935783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161935783L))
            info.setReturnValue("e!8#ogIUf7qꍭeCPDszሻEthI<*$K$}i*kᳱz㘤0s7K犨xl珛InhtZ&w確Rbꁤ喚*Eq{`T{V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1335658500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335658500L))
            info.setReturnValue(-158920619);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_1676181606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676181606L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void term_1869412747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869412747L))
            info.setReturnValue(null);
    }


}
