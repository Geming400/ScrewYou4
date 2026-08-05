package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerLoginPacketListenerImpl.class)
public class ServerLoginPacketListenerImpl_2081736044Mixin {
        @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect_180557106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(180557106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUserName()Ljava/lang/String;", cancellable = true)
    private void getUserName_946275572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946275572L))
            info.setReturnValue(">ꈬVYEeMਵH4O?*s4KbO}@OnG+oomV3qN`/:V&_RQ㴢");
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2120010782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2120010782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleKey(Lnet/minecraft/network/protocol/login/ServerboundKeyPacket;)V", cancellable = true)
    private void handleKey__723575231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-723575231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__6134270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-6134270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHello(Lnet/minecraft/network/protocol/login/ServerboundHelloPacket;)V", cancellable = true)
    private void handleHello__199766994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-199766994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCookieResponse(Lnet/minecraft/network/protocol/cookie/ServerboundCookieResponsePacket;)V", cancellable = true)
    private void handleCookieResponse__2105420170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2105420170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLoginAcknowledgement(Lnet/minecraft/network/protocol/login/ServerboundLoginAcknowledgedPacket;)V", cancellable = true)
    private void handleLoginAcknowledgement_1307194831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1307194831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomQueryPacket(Lnet/minecraft/network/protocol/login/ServerboundCustomQueryAnswerPacket;)V", cancellable = true)
    private void handleCustomQueryPacket__1269912533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1269912533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_2120014626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120014626L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fillListenerSpecificCrashDetails(Lnet/minecraft/CrashReport;Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillListenerSpecificCrashDetails_1270501056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1270501056L))
            info.cancel();
    }


}
