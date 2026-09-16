package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatType.class)
public class ChatType1615739420Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_707113152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707113152L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1908804351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908804351L))
            info.setReturnValue("-\u4D12");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2121875785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121875785L))
            info.setReturnValue(-564552613);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1061133703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061133703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind_709108738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709108738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind_883678935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883678935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind_746190379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746190379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chat()Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private void chat_1865449124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865449124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narration()Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private void narration__878613990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878613990L))
            info.setReturnValue(null);
    }


}
