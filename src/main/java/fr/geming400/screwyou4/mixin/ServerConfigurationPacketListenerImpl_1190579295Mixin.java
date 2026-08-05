package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerConfigurationPacketListenerImpl.class)
public class ServerConfigurationPacketListenerImpl_1190579295Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1228854033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228854033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResourcePackResponse(Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket;)V", cancellable = true)
    private void handleResourcePackResponse__1324205248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1324205248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientInformation(Lnet/minecraft/network/protocol/common/ServerboundClientInformationPacket;)V", cancellable = true)
    private void handleClientInformation_1768635120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1768635120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptCodeOfConduct(Lnet/minecraft/network/protocol/configuration/ServerboundAcceptCodeOfConductPacket;)V", cancellable = true)
    private void handleAcceptCodeOfConduct__514200728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514200728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1228857877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228857877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startConfiguration()V", cancellable = true)
    private void startConfiguration_1228854033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228854033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationFinished(Lnet/minecraft/network/protocol/configuration/ServerboundFinishConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationFinished_2037126973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037126973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnToWorld()V", cancellable = true)
    private void returnToWorld_1228854033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228854033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__897291019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-897291019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectKnownPacks(Lnet/minecraft/network/protocol/configuration/ServerboundSelectKnownPacks;)V", cancellable = true)
    private void handleSelectKnownPacks__1837331795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1837331795L))
            info.cancel();
    }


}
