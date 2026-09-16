package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.Grammar.class)
public class Grammar_1579078775Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_670452506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670452506L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1945464997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945464997L))
            info.setReturnValue("^u:V?-^_;]tsv\uA8F2&hK{'S{\uD1FDK\u5F0D_3dsP/]`^\uB5DF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2136430865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136430865L))
            info.setReturnValue(-991938535);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/util/Optional;", cancellable = true)
    private void parse_130730707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130730707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void top_402427199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402427199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rules()Lnet/minecraft/util/parsing/packrat/Dictionary;", cancellable = true)
    private void rules_326268690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326268690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void parseForSuggestions_1875111195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875111195L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "parseForCommands(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseForCommands_223047241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223047241L))
            info.setReturnValue(new java.lang.Object());
    }


}
