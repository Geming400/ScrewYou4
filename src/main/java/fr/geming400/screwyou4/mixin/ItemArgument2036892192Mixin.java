package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemArgument.class)
public class ItemArgument2036892192Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1296815010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296815010L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private void parse_2143478170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143478170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/item/ItemArgument;", cancellable = true)
    private static void item_1498829539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498829539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private static void getItem__2023293022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023293022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1285334401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285334401L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__533461105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533461105L))
            info.setReturnValue(null);
    }


}
