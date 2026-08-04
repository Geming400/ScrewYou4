package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.Connection.class)
public class Connection_1041426876Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1079701614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1079701614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNotification(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void sendNotification_2118793750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2118793750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNotification(Lnet/minecraft/core/Holder$Reference;Ljava/lang/Object;)V", cancellable = true)
    private void sendNotification_1585923506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1585923506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exceptionCaught(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V", cancellable = true)
    private void exceptionCaught__989584208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-989584208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelActive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelActive__1656926921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656926921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelInactive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelInactive__1656926921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656926921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendRequest(Lnet/minecraft/core/Holder$Reference;Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendRequest_1098184724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098184724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendRequest(Lnet/minecraft/core/Holder$Reference;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendRequest_1555667760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555667760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatchIncomingRequest(Ljava/lang/String;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void dispatchIncomingRequest_1920892444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920892444L))
            info.setReturnValue(null);
    }


}
