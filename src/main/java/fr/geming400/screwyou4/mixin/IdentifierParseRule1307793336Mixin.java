package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.IdentifierParseRule.class)
public class IdentifierParseRule1307793336Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse__1588937279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588937279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse_224166997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224166997L))
            info.setReturnValue(null);
    }


}
