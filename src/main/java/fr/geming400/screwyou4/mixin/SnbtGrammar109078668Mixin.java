package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtGrammar.class)
public class SnbtGrammar109078668Mixin {
        @Inject(at = @At("HEAD"), method = "escapeControlCharacters(C)Ljava/lang/String;", cancellable = true)
    private static void escapeControlCharacters_17273364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17273364L))
            info.setReturnValue("AYr;\uB488\u2281Hn;,]o%PfP+4B V\"\u5F46.\u8DFEc0G\u86C6q[rP\u6816.Aj*2<,\u8210'?z(`oXvcm\u7666");
    }

    @Inject(at = @At("HEAD"), method = "createParser(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/util/parsing/packrat/commands/Grammar;", cancellable = true)
    private static void createParser__420991586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420991586L))
            info.setReturnValue(null);
    }


}
