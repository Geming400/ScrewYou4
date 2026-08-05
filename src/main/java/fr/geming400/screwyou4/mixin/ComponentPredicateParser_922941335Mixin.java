package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ComponentPredicateParser.class)
public class ComponentPredicateParser_922941335Mixin {
        @Inject(at = @At("HEAD"), method = "createGrammar(Lnet/minecraft/commands/arguments/item/ComponentPredicateParser$Context;)Lnet/minecraft/util/parsing/packrat/commands/Grammar;", cancellable = true)
    private static void createGrammar_411987815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411987815L))
            info.setReturnValue(null);
    }


}
