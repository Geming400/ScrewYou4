package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemParser.class)
public class ItemParser_1471504510Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private void parse_1578090487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578090487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/commands/arguments/item/ItemParser$Visitor;)V", cancellable = true)
    private void parse_335977072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335977072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillSuggestions_1237901973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237901973L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
