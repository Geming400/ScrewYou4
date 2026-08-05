package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.class)
public class MessageArgument_1063830410Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getMessage_18603216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18603216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/commands/arguments/MessageArgument;", cancellable = true)
    private static void message__1209340137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209340137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse__790298242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790298242L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private void parse_243355030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243355030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private void parse_782998834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782998834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_770448666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770448666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveChatMessage(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void resolveChatMessage__1032465254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1032465254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__749817863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749817863L))
            info.setReturnValue(null);
    }


}
