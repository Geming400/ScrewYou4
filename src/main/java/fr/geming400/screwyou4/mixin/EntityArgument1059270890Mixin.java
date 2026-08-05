package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityArgument.class)
public class EntityArgument1059270890Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse_760165209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760165209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse_873975372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873975372L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse_1783575605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783575605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2020530984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020530984L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void player_1611039929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611039929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalEntities(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getOptionalEntities_1028821815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028821815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalPlayers(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getOptionalPlayers_537128338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537128338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_307713099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307713099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1511082407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511082407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void players_1370390152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370390152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private static void getPlayer_1171693690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171693690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getPlayers__1280117742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280117742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getEntities_528768183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(528768183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entities()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void entities__221043751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221043751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void entity__1688610569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688610569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void getEntity__1268250811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268250811L))
            info.setReturnValue(null);
    }


}
