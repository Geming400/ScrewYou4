package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatType.class)
public class ChatType1615739420Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1293715617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293715617L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_480279445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480279445L))
            info.setReturnValue("*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1654002162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654002162L))
            info.setReturnValue(-1652318396);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_423220917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(423220917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind_1573101791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573101791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind__830222860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830222860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bind(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private static void bind__1781447160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781447160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chat()Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private void chat__1895505668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895505668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narration()Lnet/minecraft/network/chat/ChatTypeDecoration;", cancellable = true)
    private void narration__1895505668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895505668L))
            info.setReturnValue(null);
    }


}
