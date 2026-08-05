package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.UnquotedStringParseRule.class)
public class UnquotedStringParseRule1463101967Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/String;", cancellable = true)
    private void parse_1679661274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679661274L))
            info.setReturnValue("/P>=7AsZtUd");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse_379475628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379475628L))
            info.setReturnValue(new java.lang.Object());
    }


}
