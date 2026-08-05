package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TeamArgument.class)
public class TeamArgument71463396Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__221918347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221918347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/String;", cancellable = true)
    private void parse_1078267299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078267299L))
            info.setReturnValue(";]8\u8D1D_%>bSeoDBD?u}%\u9D2C\u9AD4o\u248Apje*\"=ObIkD\uD7DC");
    }

    @Inject(at = @At("HEAD"), method = "team()Lnet/minecraft/commands/arguments/TeamArgument;", cancellable = true)
    private static void team__787533062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787533062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTeam(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private static void getTeam__407028983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407028983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_312386838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312386838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1742184876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742184876L))
            info.setReturnValue(null);
    }


}
