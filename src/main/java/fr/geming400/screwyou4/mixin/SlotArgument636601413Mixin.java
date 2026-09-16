package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.SlotArgument.class)
public class SlotArgument636601413Mixin {
        @Inject(at = @At("HEAD"), method = "slot()Lnet/minecraft/commands/arguments/SlotArgument;", cancellable = true)
    private static void slot__1643241380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643241380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Integer;", cancellable = true)
    private void parse_1681057948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681057948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1597861507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597861507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)I", cancellable = true)
    private static void getSlot_2052720219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052720219L))
            info.setReturnValue(-200302959);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1933751884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933751884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__114956378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114956378L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
