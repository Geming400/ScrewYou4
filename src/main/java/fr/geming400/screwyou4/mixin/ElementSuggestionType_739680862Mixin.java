package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.SharedSuggestionProvider.ElementSuggestionType.class)
public class ElementSuggestionType_739680862Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;", cancellable = true)
    private static void values_1141971167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141971167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;", cancellable = true)
    private static void valueOf__1845964936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845964936L))
            info.setReturnValue(net.minecraft.commands.SharedSuggestionProvider.ElementSuggestionType.ALL);
    }

    @Inject(at = @At("HEAD"), method = "shouldSuggestTags()Z", cancellable = true)
    private void shouldSuggestTags_1338745930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338745930L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldSuggestElements()Z", cancellable = true)
    private void shouldSuggestElements_271745708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271745708L))
            info.setReturnValue(true);
    }


}
