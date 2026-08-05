package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.SlotArgument.class)
public class SlotArgument636601413Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/commands/arguments/SlotArgument;", cancellable = true)
    private static void slot_117014298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117014298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse_1441866665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441866665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_343219670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343219670L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getSlot(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)I", cancellable = true)
    private static void getSlot__127357465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-127357465L))
            info.setReturnValue(-2115004142);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_877524855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877524855L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1177046859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177046859L))
            info.setReturnValue(null);
    }


}
