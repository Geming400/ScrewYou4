package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerLoginPacketListenerImpl.class)
public class ServerLoginPacketListenerImpl_2081736044Mixin {
        @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect_927920918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(927920918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUserName()Ljava/lang/String;", cancellable = true)
    private void getUserName__1740544416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740544416L))
            info.setReturnValue("L\u0661o\uA246K\uD4B5!@FK::yFrj\u4BC3f\u7A0A\u09961UZ-ACfk\uB0206V0Ep*t2\"@5c\uA7A05y+Go^;wwBC'\u2E8EY");
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1952052385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1952052385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__1911968889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1911968889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHello(Lnet/minecraft/network/protocol/login/ServerboundHelloPacket;)V", cancellable = true)
    private void handleHello__1497492168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1497492168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleKey(Lnet/minecraft/network/protocol/login/ServerboundKeyPacket;)V", cancellable = true)
    private void handleKey_1882000728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882000728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCookieResponse(Lnet/minecraft/network/protocol/cookie/ServerboundCookieResponsePacket;)V", cancellable = true)
    private void handleCookieResponse__1647446525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1647446525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomQueryPacket(Lnet/minecraft/network/protocol/login/ServerboundCustomQueryAnswerPacket;)V", cancellable = true)
    private void handleCustomQueryPacket_1802368482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802368482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLoginAcknowledgement(Lnet/minecraft/network/protocol/login/ServerboundLoginAcknowledgedPacket;)V", cancellable = true)
    private void handleLoginAcknowledgement_504356776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504356776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_2133361510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133361510L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillListenerSpecificCrashDetails(Lnet/minecraft/CrashReport;Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillListenerSpecificCrashDetails__137267364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-137267364L))
            info.cancel();
    }


}
