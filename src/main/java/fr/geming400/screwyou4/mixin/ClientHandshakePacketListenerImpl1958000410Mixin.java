package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientHandshakePacketListenerImpl.class)
public class ClientHandshakePacketListenerImpl1958000410Mixin {
        @Inject(at = @At("HEAD"), method = "fillListenerSpecificCrashDetails(Lnet/minecraft/CrashReport;Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillListenerSpecificCrashDetails_1146765423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1146765423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRequestCookie(Lnet/minecraft/network/protocol/cookie/ClientboundCookieRequestPacket;)V", cancellable = true)
    private void handleRequestCookie_531762995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(531762995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisconnect(Lnet/minecraft/network/protocol/login/ClientboundLoginDisconnectPacket;)V", cancellable = true)
    private void handleDisconnect__1351566942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1351566942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1996278993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996278993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__129869903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-129869903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLoginFinished(Lnet/minecraft/network/protocol/login/ClientboundLoginFinishedPacket;)V", cancellable = true)
    private void handleLoginFinished__71878260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-71878260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHello(Lnet/minecraft/network/protocol/login/ClientboundHelloPacket;)V", cancellable = true)
    private void handleHello__1416323499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1416323499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomQuery(Lnet/minecraft/network/protocol/login/ClientboundCustomQueryPacket;)V", cancellable = true)
    private void handleCustomQuery__580667664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-580667664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinigameName(Ljava/lang/String;)V", cancellable = true)
    private void setMinigameName__1184605737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1184605737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCompression(Lnet/minecraft/network/protocol/login/ClientboundLoginCompressionPacket;)V", cancellable = true)
    private void handleCompression__143369908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-143369908L))
            info.cancel();
    }


}
