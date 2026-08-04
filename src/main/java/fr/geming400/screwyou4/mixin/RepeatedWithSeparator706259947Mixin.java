package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.RepeatedWithSeparator.class)
public class RepeatedWithSeparator706259947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2091772206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091772206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__429200028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429200028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_744522689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744522689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_1085045795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085045795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "element()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void element_2006319775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006319775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void separator_1278276936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278276936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minRepetitions()I", cancellable = true)
    private void minRepetitions_744522193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744522193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowTrailingSeparator()Z", cancellable = true)
    private void allowTrailingSeparator_744538530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744538530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listName()Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private void listName_2022242883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022242883L))
            info.setReturnValue(null);
    }


}
