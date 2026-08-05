package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.IdentifierParseRule.class)
public class IdentifierParseRule1307793336Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parse__1107926610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107926610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse__1934083710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934083710L))
            info.setReturnValue(new java.lang.Object());
    }


}
