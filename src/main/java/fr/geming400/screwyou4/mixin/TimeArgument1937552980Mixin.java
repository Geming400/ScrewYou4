package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.class)
public class TimeArgument1937552980Mixin {
        @Inject(at = @At("HEAD"), method = "time()Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private static void time_1615318285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615318285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time(I)Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private static void time__315610112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315610112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1396154222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396154222L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse__1312957781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312957781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__632800317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632800317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1185995189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185995189L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
