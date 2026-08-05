package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Alternative.class)
public class Alternative363580595Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1749092854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749092854L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__771879380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771879380L))
            info.setReturnValue("(q&b\u0F4F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_401843337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401843337L))
            info.setReturnValue(1025135668);
    }

    @Inject(at = @At("HEAD"), method = "elements()[Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void elements__549483017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549483017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_742366443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742366443L))
            info.setReturnValue(true);
    }


}
