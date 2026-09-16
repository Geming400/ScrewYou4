package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientHandshakePacketListenerImpl.class)
public class ClientHandshakePacketListenerImpl1958000410Mixin {
        @Inject(at = @At("HEAD"), method = "fillListenerSpecificCrashDetails(Lnet/minecraft/CrashReport;Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillListenerSpecificCrashDetails__261002997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-261002997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRequestCookie(Lnet/minecraft/network/protocol/cookie/ClientboundCookieRequestPacket;)V", cancellable = true)
    private void handleRequestCookie__948654648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-948654648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__2035704522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2035704522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisconnect(Lnet/minecraft/network/protocol/login/ClientboundLoginDisconnectPacket;)V", cancellable = true)
    private void handleDisconnect__1866632058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1866632058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHello(Lnet/minecraft/network/protocol/login/ClientboundHelloPacket;)V", cancellable = true)
    private void handleHello_1580918623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1580918623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLoginFinished(Lnet/minecraft/network/protocol/login/ClientboundLoginFinishedPacket;)V", cancellable = true)
    private void handleLoginFinished__1947632769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947632769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCompression(Lnet/minecraft/network/protocol/login/ClientboundLoginCompressionPacket;)V", cancellable = true)
    private void handleCompression__1782743058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1782743058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomQuery(Lnet/minecraft/network/protocol/login/ClientboundCustomQueryPacket;)V", cancellable = true)
    private void handleCustomQuery__2017579905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2017579905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinigameName(Ljava/lang/String;)V", cancellable = true)
    private void setMinigameName__220309343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-220309343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_2009625877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009625877L))
            info.setReturnValue(true);
    }


}
