package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemParser.class)
public class ItemParser_1471504510Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/item/ItemInput;", cancellable = true)
    private void parse__448338364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448338364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/commands/arguments/item/ItemParser$Visitor;)V", cancellable = true)
    private void parse__36699011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-36699011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillSuggestions(Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillSuggestions_1661946153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661946153L))
            info.setReturnValue(null);
    }


}
