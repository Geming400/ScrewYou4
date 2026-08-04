package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemArgument.class)
public class ItemArgument2036892192Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1743510449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743510449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private void parse_117049319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117049319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/item/ItemArgument;", cancellable = true)
    private static void item__595083952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595083952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private static void getItem__739940711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739940711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__2017151662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017151662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_223243920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223243920L))
            info.setReturnValue(null);
    }


}
