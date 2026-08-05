package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Rule.WrappedTerm.class)
public class WrappedTerm920945959Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1988509078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988509078L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__214514016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214514016L))
            info.setReturnValue("34C\u033EQzmw!\u37F3{GMU\u7CE60\u439DaA)VjR#<\u6BCBH.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_959208701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959208701L))
            info.setReturnValue(-538157588);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/util/parsing/packrat/Rule$RuleAction;", cancellable = true)
    private void action_1044851830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044851830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse__162809340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162809340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void child_1492962948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492962948L))
            info.setReturnValue(null);
    }


}
