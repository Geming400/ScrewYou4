package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityArgument.class)
public class EntityArgument1059270890Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_765889147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765889147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse__794857761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794857761L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse_1370457324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370457324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/selector/EntitySelector;", cancellable = true)
    private void parse_1910101128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910101128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getEntities__1413730802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413730802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entities()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void entities__567372550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567372550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void entity__567372550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567372550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void getEntity__1409076436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409076436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalPlayers(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getOptionalPlayers__1413730802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413730802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void player__567372550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567372550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private static void players__567372550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567372550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1300194332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300194332L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__754377382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754377382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayer(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private static void getPlayer__1500823261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500823261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getPlayers__1413730802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413730802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptionalEntities(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getOptionalEntities__1413730802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413730802L))
            info.setReturnValue(null);
    }


}
