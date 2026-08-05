package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.GreedyPatternParseRule.class)
public class GreedyPatternParseRule_177233127Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/String;", cancellable = true)
    private void parse__1764458274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764458274L))
            info.setReturnValue("-\u79D7Zk)!\u0855\uD0853f>1DaaW+v\u11BA:\"q]n\u326CP\u75C1\u9265%e;\u2DF32}\u4DA3m\u71820'?\u7423C[K!N)w)0'aIfu'%:teekNGA\u3059l");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse_1230323376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230323376L))
            info.setReturnValue(new java.lang.Object());
    }


}
