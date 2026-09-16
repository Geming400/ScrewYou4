package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Rule.WrappedTerm.class)
public class WrappedTerm920945959Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_12319691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12319691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1691369484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691369484L))
            info.setReturnValue("pK\uD4DA%3P|@(u9/'Uf\u06272g\u2777<:@H$\u983FWD0GI=(%n5KFd\u858Dmvz5I<GA<BE_;>bOY\u76A0 SoDB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1478298050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478298050L))
            info.setReturnValue(404802514);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/util/parsing/packrat/Rule$RuleAction;", cancellable = true)
    private void action_1511952556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511952556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse_1973907249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973907249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child()Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void child_1406564072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406564072L))
            info.setReturnValue(null);
    }


}
