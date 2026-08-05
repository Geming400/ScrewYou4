package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.TagParseRule.class)
public class TagParseRule_634403073Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void parse__564326657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564326657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/lang/Object;", cancellable = true)
    private void parse__449223267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449223267L))
            info.setReturnValue(new java.lang.Object());
    }


}
