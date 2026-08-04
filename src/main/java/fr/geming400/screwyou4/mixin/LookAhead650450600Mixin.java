package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.LookAhead.class)
public class LookAhead650450600Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2035962859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035962859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__485009375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485009375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_688713342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688713342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_1029236448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029236448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "term()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void term_1222467589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222467589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "positive()Z", cancellable = true)
    private void positive_688729183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688729183L))
            info.setReturnValue(null);
    }


}
