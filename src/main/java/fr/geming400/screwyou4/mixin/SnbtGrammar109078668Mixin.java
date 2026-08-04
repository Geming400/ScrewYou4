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
            info.setReturnValue(null);
    }


}
