package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.class)
public class TimeArgument1937552980Mixin {
        @Inject(at = @At("HEAD"), method = "time()Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private static void time__1202208518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202208518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time(I)Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private static void time__1759595085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759595085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1644171237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644171237L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse__1552149064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552149064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_123904708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123904708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__2116490874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116490874L))
            info.setReturnValue(null);
    }


}
