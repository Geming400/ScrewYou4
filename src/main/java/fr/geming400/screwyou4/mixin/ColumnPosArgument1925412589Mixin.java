package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.ColumnPosArgument.class)
public class ColumnPosArgument1925412589Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1632030846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632030846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/Coordinates;", cancellable = true)
    private void parse_760653782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760653782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__2128631265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128631265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnPos()Lnet/minecraft/commands/arguments/coordinates/ColumnPosArgument;", cancellable = true)
    private static void columnPos__1754510120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754510120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColumnPos(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ColumnPos;", cancellable = true)
    private static void getColumnPos_547945908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547945908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_111764317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111764317L))
            info.setReturnValue(null);
    }


}
