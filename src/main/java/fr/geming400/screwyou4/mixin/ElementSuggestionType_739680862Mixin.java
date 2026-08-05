package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.SharedSuggestionProvider.ElementSuggestionType.class)
public class ElementSuggestionType_739680862Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;", cancellable = true)
    private static void values__1918226755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918226755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;", cancellable = true)
    private static void valueOf_1046733216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046733216L))
            info.setReturnValue(net.minecraft.commands.SharedSuggestionProvider.ElementSuggestionType.ALL);
    }

    @Inject(at = @At("HEAD"), method = "shouldSuggestTags()Z", cancellable = true)
    private void shouldSuggestTags_777959444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777959444L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldSuggestElements()Z", cancellable = true)
    private void shouldSuggestElements_777959444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777959444L))
            info.setReturnValue(true);
    }


}
