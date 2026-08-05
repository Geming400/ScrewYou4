package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.StringReaderTerms.TerminalWord.class)
public class TerminalWord252611801Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__882848670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882848670L))
            info.setReturnValue("0pGa{+M;o\u48E7RoO?;>DoJ)b6\uC0F9=\uA0F4S|r:S+?%");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_631397649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631397649L))
            info.setReturnValue(true);
    }


}
