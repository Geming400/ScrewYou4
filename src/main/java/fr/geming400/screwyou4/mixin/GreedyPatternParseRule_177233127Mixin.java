package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.GreedyPatternParseRule.class)
public class GreedyPatternParseRule_177233127Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/String;", cancellable = true)
    private void parse_393792433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393792433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse__906393213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906393213L))
            info.setReturnValue(null);
    }


}
