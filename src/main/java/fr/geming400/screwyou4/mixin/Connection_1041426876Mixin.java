package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.Connection.class)
public class Connection_1041426876Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_911743217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911743217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendRequest(Lnet/minecraft/core/Holder$Reference;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendRequest__287978455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287978455L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "sendRequest(Lnet/minecraft/core/Holder$Reference;Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void sendRequest_27147469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27147469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatchIncomingRequest(Ljava/lang/String;Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonElement;", cancellable = true)
    private void dispatchIncomingRequest_911487947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911487947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "channelActive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelActive_1276705262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1276705262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exceptionCaught(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V", cancellable = true)
    private void exceptionCaught__494665829(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-494665829L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelInactive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelInactive__213413527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-213413527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNotification(Lnet/minecraft/core/Holder$Reference;Ljava/lang/Object;)V", cancellable = true)
    private void sendNotification_238751685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(238751685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNotification(Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void sendNotification_1743614697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743614697L))
            info.cancel();
    }


}
