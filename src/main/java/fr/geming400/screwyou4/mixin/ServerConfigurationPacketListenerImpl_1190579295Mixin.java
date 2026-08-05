package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerConfigurationPacketListenerImpl.class)
public class ServerConfigurationPacketListenerImpl_1190579295Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1060895636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1060895636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResourcePackResponse(Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket;)V", cancellable = true)
    private void handleResourcePackResponse__1140788688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1140788688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientInformation(Lnet/minecraft/network/protocol/common/ServerboundClientInformationPacket;)V", cancellable = true)
    private void handleClientInformation_1048279735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1048279735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptCodeOfConduct(Lnet/minecraft/network/protocol/configuration/ServerboundAcceptCodeOfConductPacket;)V", cancellable = true)
    private void handleAcceptCodeOfConduct_1685408760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1685408760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationFinished(Lnet/minecraft/network/protocol/configuration/ServerboundFinishConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationFinished_1749902717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1749902717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectKnownPacks(Lnet/minecraft/network/protocol/configuration/ServerboundSelectKnownPacks;)V", cancellable = true)
    private void handleSelectKnownPacks_1493391602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493391602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect_1491841658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1491841658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnToWorld()V", cancellable = true)
    private void returnToWorld__1614038806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1614038806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1242204761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242204761L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startConfiguration()V", cancellable = true)
    private void startConfiguration_1203434461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1203434461L))
            info.cancel();
    }


}
