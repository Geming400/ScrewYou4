package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.BlockPosArgument.class)
public class BlockPosArgument_1581853708Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse_290569377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290569377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1751853495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751853495L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getBlockPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getBlockPos_2095126341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095126341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/commands/arguments/coordinates/BlockPosArgument;", cancellable = true)
    private static void blockPos__70613316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70613316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__988499590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988499590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_830295916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830295916L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getLoadedBlockPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLoadedBlockPos_1981868522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981868522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoadedBlockPos(Lcom/mojang/brigadier/context/CommandContext;Lnet/minecraft/server/level/ServerLevel;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getLoadedBlockPos__1257735685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257735685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnablePos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getSpawnablePos__2055837571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055837571L))
            info.setReturnValue(null);
    }


}
