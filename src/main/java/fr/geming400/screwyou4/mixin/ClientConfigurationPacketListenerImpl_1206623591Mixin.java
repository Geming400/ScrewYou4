package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientConfigurationPacketListenerImpl.class)
public class ClientConfigurationPacketListenerImpl_1206623591Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1244898329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1244898329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1244902173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244902173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleCodeOfConduct(Lnet/minecraft/network/protocol/configuration/ClientboundCodeOfConductPacket;)V", cancellable = true)
    private void handleCodeOfConduct_510060224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(510060224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__881246723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-881246723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEnabledFeatures(Lnet/minecraft/network/protocol/configuration/ClientboundUpdateEnabledFeaturesPacket;)V", cancellable = true)
    private void handleEnabledFeatures__1108818677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1108818677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateTags(Lnet/minecraft/network/protocol/common/ClientboundUpdateTagsPacket;)V", cancellable = true)
    private void handleUpdateTags_954564981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(954564981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRegistryData(Lnet/minecraft/network/protocol/configuration/ClientboundRegistryDataPacket;)V", cancellable = true)
    private void handleRegistryData__1791250463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791250463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectKnownPacks(Lnet/minecraft/network/protocol/configuration/ClientboundSelectKnownPacks;)V", cancellable = true)
    private void handleSelectKnownPacks__932837827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-932837827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResetChat(Lnet/minecraft/network/protocol/configuration/ClientboundResetChatPacket;)V", cancellable = true)
    private void handleResetChat__302281447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-302281447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationFinished(Lnet/minecraft/network/protocol/configuration/ClientboundFinishConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationFinished_605001405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605001405L))
            info.cancel();
    }


}
