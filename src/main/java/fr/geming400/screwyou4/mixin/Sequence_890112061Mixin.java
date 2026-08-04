package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Sequence.class)
public class Sequence_890112061Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2019342977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019342977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__245347915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245347915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_928374802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928374802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elements()[Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void elements__22951552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22951552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_1268897908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268897908L))
            info.setReturnValue(null);
    }


}
