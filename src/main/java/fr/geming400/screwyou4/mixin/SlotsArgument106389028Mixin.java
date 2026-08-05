package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.SlotsArgument.class)
public class SlotsArgument106389028Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__186992715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186992715L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private void parse_1762721143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762721143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/commands/arguments/SlotsArgument;", cancellable = true)
    private static void slots__2127235324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127235324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1707259244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707259244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_347312470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(347312470L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getSlots(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private static void getSlots_2045425193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045425193L))
            info.setReturnValue(null);
    }


}
