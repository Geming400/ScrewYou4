package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientSuggestionProvider.class)
public class ClientSuggestionProvider1190209884Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions_117650330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117650330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__638825602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638825602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedEntities()Ljava/util/Collection;", cancellable = true)
    private void getSelectedEntities__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelevantCoordinates()Ljava/util/Collection;", cancellable = true)
    private void getRelevantCoordinates__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteCoordinates()Ljava/util/Collection;", cancellable = true)
    private void getAbsoluteCoordinates__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerNames()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerNames__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomTabSuggestions()Ljava/util/Collection;", cancellable = true)
    private void getCustomTabSuggestions__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1199686627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199686627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures_1855030382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855030382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSuggestion(Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void customSuggestion__1294396673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294396673L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getAllTeams()Ljava/util/Collection;", cancellable = true)
    private void getAllTeams__623438388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623438388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "completeCustomSuggestions(ILcom/mojang/brigadier/suggestion/Suggestions;)V", cancellable = true)
    private void completeCustomSuggestions__1633741168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1633741168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyCustomCompletions(Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;Ljava/util/List;)V", cancellable = true)
    private void modifyCustomCompletions__391962693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-391962693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestRegistryElements(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void suggestRegistryElements__1544095584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544095584L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableSounds_979503569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979503569L))
            info.setReturnValue(null);
    }


}
