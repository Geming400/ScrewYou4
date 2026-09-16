package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TeamArgument.class)
public class TeamArgument71463396Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1032723490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032723490L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/String;", cancellable = true)
    private void parse__1962058160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962058160L))
            info.setReturnValue("Gd#9Ar^3\uA2D0STeE?(y4W\u9D73I0:PMX\uACDD`\u7446mMXz*AgW|=o]l,\u670B\uB51B|i\u56847\uCEBD5#p4}Knj5n/\u3236o;3a3!S.0\u045CBJmE");
    }

    @Inject(at = @At("HEAD"), method = "getTeam(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private static void getTeam_1704629788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704629788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "team()Lnet/minecraft/commands/arguments/TeamArgument;", cancellable = true)
    private static void team__527055491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527055491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__680094395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680094395L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1796077395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796077395L))
            info.setReturnValue(null);
    }


}
