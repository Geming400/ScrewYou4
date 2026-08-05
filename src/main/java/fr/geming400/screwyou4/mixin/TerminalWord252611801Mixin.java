package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.StringReaderTerms.TerminalWord.class)
public class TerminalWord252611801Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1023034830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023034830L))
            info.setReturnValue("}U4BG>");
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;Lnet/minecraft/util/parsing/packrat/Scope;Lnet/minecraft/util/parsing/packrat/Control;)Z", cancellable = true)
    private void parse_48808964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48808964L))
            info.setReturnValue(false);
    }


}
