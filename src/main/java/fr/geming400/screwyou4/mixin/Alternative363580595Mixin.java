package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Term.Alternative.class)
public class Alternative363580595Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__545045673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545045673L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1134004120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134004120L))
            info.setReturnValue("h!@\u23B2xbA?2 DHw5xl'Et-^e\u57F3)(?|Pr/'e\u9F26{-CxY<WIX\uFC4D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_920932686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920932686L))
            info.setReturnValue(-1991476357);
    }

    @Inject(at = @At("HEAD"), method = "elements()[Lnet/minecraft/util/parsing/packrat/Term;", cancellable = true)
    private void elements__1270139218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270139218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_159777758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159777758L))
            info.setReturnValue(false);
    }


}
