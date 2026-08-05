package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SuggestionProviders.class)
public class SuggestionProviders1574734032Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getName_1306716680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306716680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void cast_874177094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874177094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lcom/mojang/brigadier/suggestion/SuggestionProvider;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void register_960885922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960885922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProvider(Lnet/minecraft/resources/Identifier;)Lcom/mojang/brigadier/suggestion/SuggestionProvider;", cancellable = true)
    private static void getProvider_155022702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155022702L))
            info.setReturnValue(null);
    }


}
