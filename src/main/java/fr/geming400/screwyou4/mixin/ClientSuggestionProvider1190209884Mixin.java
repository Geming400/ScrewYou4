package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientSuggestionProvider.class)
public class ClientSuggestionProvider1190209884Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__922243554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922243554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__1362867793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362867793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_135316674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135316674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__977655152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977655152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAbsoluteCoordinates()Ljava/util/Collection;", cancellable = true)
    private void getAbsoluteCoordinates_1202454810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202454810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerNames()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerNames__568056790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568056790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedEntities()Ljava/util/Collection;", cancellable = true)
    private void getSelectedEntities_898541118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898541118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelevantCoordinates()Ljava/util/Collection;", cancellable = true)
    private void getRelevantCoordinates__199472204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199472204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllTeams()Ljava/util/Collection;", cancellable = true)
    private void getAllTeams_1529219095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529219095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSuggestion(Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void customSuggestion__1451787190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451787190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomTabSuggestions()Ljava/util/Collection;", cancellable = true)
    private void getCustomTabSuggestions__1589450515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589450515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "completeCustomSuggestions(ILcom/mojang/brigadier/suggestion/Suggestions;)V", cancellable = true)
    private void completeCustomSuggestions_1340133355(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1340133355L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifyCustomCompletions(Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;Ljava/util/List;)V", cancellable = true)
    private void modifyCustomCompletions_1870031367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1870031367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/stream/Stream;", cancellable = true)
    private void getAvailableSounds_235053562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235053562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suggestRegistryElements(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/SharedSuggestionProvider$ElementSuggestionType;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;Lcom/mojang/brigadier/context/CommandContext;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void suggestRegistryElements_1518472104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518472104L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
