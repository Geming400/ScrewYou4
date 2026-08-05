package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.MessageArgument.class)
public class MessageArgument_1063830410Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getMessage__1631557601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631557601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/commands/arguments/MessageArgument;", cancellable = true)
    private static void message_1407468510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407468510L))
            info.setReturnValue(new net.minecraft.commands.arguments.MessageArgument());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void parse_878534891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878534891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Ljava/lang/Object;)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private void parse__366937085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366937085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/MessageArgument$Message;", cancellable = true)
    private void parse_656473311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656473311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2025090503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025090503L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1506522888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506522888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveChatMessage(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void resolveChatMessage__1818678025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818678025L))
            info.cancel();
    }


}
