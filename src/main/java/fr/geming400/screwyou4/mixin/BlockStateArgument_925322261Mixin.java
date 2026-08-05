package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateArgument.class)
public class BlockStateArgument_925322261Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_631940517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631940517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockInput;", cancellable = true)
    private void parse_1449239070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449239070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/blocks/BlockStateArgument;", cancellable = true)
    private static void block_1348552166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348552166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlock(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/blocks/BlockInput;", cancellable = true)
    private static void getBlock_137474844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137474844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1166245702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166245702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__888326012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888326012L))
            info.setReturnValue(null);
    }


}
