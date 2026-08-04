package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SuggestionProviders.class)
public class SuggestionProviders1574734032Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getName_11479687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11479687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void cast_1859027335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859027335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void register__968188929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968188929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProvider(Lnet/minecraft/resources/Identifier;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void getProvider__1072203129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072203129L))
            info.setReturnValue(null);
    }


}
