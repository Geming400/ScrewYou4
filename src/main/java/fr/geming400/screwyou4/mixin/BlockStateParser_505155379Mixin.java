package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockStateParser.class)
public class BlockStateParser_505155379Mixin {
        @Inject(at = @At("HEAD"), method = "parseForBlock(Lnet/minecraft/core/HolderLookup;Ljava/lang/String;Z)Lnet/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult;", cancellable = true)
    private static void parseForBlock_1413432679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413432679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForBlock(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/blocks/BlockStateParser$BlockResult;", cancellable = true)
    private static void parseForBlock__895881699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895881699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForTesting(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/StringReader;Z)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void parseForTesting_91922742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91922742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseForTesting(Lnet/minecraft/core/HolderLookup;Ljava/lang/String;Z)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void parseForTesting__522914260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522914260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lnet/minecraft/core/HolderLookup;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;ZZ)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void fillSuggestions_223646337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223646337L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "serialize(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/String;", cancellable = true)
    private static void serialize_43858020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43858020L))
            info.setReturnValue("x}xUG\u9361uzj\u130FN4TBWsn-$Eo.e:%z4\uCFFBnX3`7TT[");
    }


}
