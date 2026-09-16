package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatMessage.System.class)
public class System427278258Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private void type_1238592522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238592522L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.PLAYER);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__481348010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481348010L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1197701783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197701783L))
            info.setReturnValue("]?u<]Vr\uFB61\u5322%\u6959+KI`1ixsz\"F,[osLk+lWkWfoeUEHRlzB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_984630349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984630349L))
            info.setReturnValue(1966409049);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void message__1079261300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079261300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__2091366124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091366124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toContentComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toContentComponent__1854413148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854413148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReport(Ljava/util/UUID;)Z", cancellable = true)
    private void canReport__1757960039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757960039L))
            info.setReturnValue(true);
    }


}
