package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityAnchorArgument.class)
public class EntityAnchorArgument_1353704897Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1980002306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980002306L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private void parse__193048551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193048551L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "anchor()Lnet/minecraft/commands/arguments/EntityAnchorArgument;", cancellable = true)
    private static void anchor__2043087098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043087098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAnchor(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;", cancellable = true)
    private static void getAnchor__988458977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988458977L))
            info.setReturnValue(net.minecraft.commands.arguments.EntityAnchorArgument.Anchor.EYES);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_602147105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602147105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1216648401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1216648401L))
            info.setReturnValue(null);
    }


}
