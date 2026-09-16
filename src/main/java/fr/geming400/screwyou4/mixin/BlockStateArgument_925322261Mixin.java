package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateArgument.class)
public class BlockStateArgument_925322261Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1886582354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886582354L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/blocks/BlockInput;", cancellable = true)
    private void parse_730826635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730826635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/blocks/BlockStateArgument;", cancellable = true)
    private static void block__1476443405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476443405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlock(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/blocks/BlockInput;", cancellable = true)
    private static void getBlock__605169051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605169051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1645031037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645031037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_173764469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173764469L))
            info.setReturnValue(null);
    }


}
