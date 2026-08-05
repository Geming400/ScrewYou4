package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.commands.Grammar.class)
public class Grammar_1579078775Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1330376263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330376263L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_443618799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443618799L))
            info.setReturnValue("'?M?GC{ c\"IY<㞫DkBrP깍6Y噚pJZdvg\"tT>*4x!!Z榈bqA5!O)T*[Lfv㘠緄G83wg05Zu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1617341516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617341516L))
            info.setReturnValue(1620849711);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lnet/minecraft/util/parsing/packrat/ParseState;)Ljava/util/Optional;", cancellable = true)
    private void parse__259543834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259543834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()Lnet/minecraft/util/parsing/packrat/NamedRule;", cancellable = true)
    private void top__1415828694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415828694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rules()Lnet/minecraft/util/parsing/packrat/Dictionary;", cancellable = true)
    private void rules_1369951593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369951593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void parseForSuggestions_1769520418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769520418L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "parseForCommands(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parseForCommands_1285568071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285568071L))
            info.setReturnValue(new java.lang.Object());
    }


}
