package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.SlotsArgument.class)
public class SlotsArgument106389028Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1067649122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067649122L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private void parse_1190935082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190935082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/commands/arguments/SlotsArgument;", cancellable = true)
    private static void slots_386141369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386141369L))
            info.setReturnValue(new net.minecraft.commands.arguments.SlotsArgument());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1831003027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831003027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__645168763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645168763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlots(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private static void getSlots_1471592488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471592488L))
            info.setReturnValue(null);
    }


}
