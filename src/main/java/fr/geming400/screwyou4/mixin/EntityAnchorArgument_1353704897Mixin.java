package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityAnchorArgument.class)
public class EntityAnchorArgument_1353704897Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1060323153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060323153L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void parse__95777044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95777044L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "anchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument;", cancellable = true)
    private static void anchor__764530981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764530981L))
            info.setReturnValue(new net.minecraft.commands.arguments.EntityAnchorArgument());
    }

    @Inject(at = @At("HEAD"), method = "getAnchor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void getAnchor_1889718378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889718378L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__459943376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459943376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1594628338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594628338L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
