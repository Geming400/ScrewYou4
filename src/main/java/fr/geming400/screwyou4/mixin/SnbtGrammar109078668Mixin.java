package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtGrammar.class)
public class SnbtGrammar109078668Mixin {
        @Inject(at = @At("HEAD"), method = "createParser(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/util/parsing/packrat/commands/Grammar;", cancellable = true)
    private static void createParser_1112556195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112556195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "escapeControlCharacters(C)Ljava/lang/String;", cancellable = true)
    private static void escapeControlCharacters__1968354822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968354822L))
            info.setReturnValue("23(`D3t>M[ar(BAP#\u249FI\u693A\u5615.Q\u8D2A]WAFU/@mRh];O\u2265\u5DF2\uA3B69\uBFDEuAP}c\u0394oHGN+u\uCEDDg\u8421P\u61D9l}Pq\u2BCD&.G&:CAhCw[0");
    }


}
