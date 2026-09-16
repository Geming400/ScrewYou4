package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.RepeatedWithSeparator.class)
public class RepeatedWithSeparator706259947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__202366321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202366321L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1476683472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476683472L))
            info.setReturnValue("*y3MOd{YOmQ5\uCAB7j=w0q@_Amp#IGAy\uA671/)h \u63B0V#+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1263612038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263612038L))
            info.setReturnValue(256622035);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_502457110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502457110L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "element()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void element_1076292251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076292251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void separator__1931410813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931410813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowTrailingSeparator()Z", cancellable = true)
    private void allowTrailingSeparator_4404162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4404162L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "minRepetitions()I", cancellable = true)
    private void minRepetitions_1060457313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060457313L))
            info.setReturnValue(-808702853);
    }

    @Inject(at = @At("HEAD"), method = "listName()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void listName__1503511398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503511398L))
            info.setReturnValue(null);
    }


}
