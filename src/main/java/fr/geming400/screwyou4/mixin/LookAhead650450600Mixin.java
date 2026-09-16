package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.LookAhead.class)
public class LookAhead650450600Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__258175668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258175668L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1420874125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420874125L))
            info.setReturnValue("F\u69A9laVoD'3'\uCAE6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1207802691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207802691L))
            info.setReturnValue(-204367163);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_446647763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446647763L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void term_678779673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678779673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "positive()Z", cancellable = true)
    private void positive__971446778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971446778L))
            info.setReturnValue(false);
    }


}
