package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientConfigurationPacketListenerImpl.class)
public class ClientConfigurationPacketListenerImpl_1206623591Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1076939932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1076939932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationFinished(Lnet/minecraft/network/protocol/configuration/ClientboundFinishConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationFinished_317777149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(317777149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRegistryData(Lnet/minecraft/network/protocol/configuration/ClientboundRegistryDataPacket;)V", cancellable = true)
    private void handleRegistryData__1296372750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1296372750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResetChat(Lnet/minecraft/network/protocol/configuration/ClientboundResetChatPacket;)V", cancellable = true)
    private void handleResetChat__1824936232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1824936232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectKnownPacks(Lnet/minecraft/network/protocol/configuration/ClientboundSelectKnownPacks;)V", cancellable = true)
    private void handleSelectKnownPacks__1897081726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1897081726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEnabledFeatures(Lnet/minecraft/network/protocol/configuration/ClientboundUpdateEnabledFeaturesPacket;)V", cancellable = true)
    private void handleEnabledFeatures_335621345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335621345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect_1507885954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1507885954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateTags(Lnet/minecraft/network/protocol/common/ClientboundUpdateTagsPacket;)V", cancellable = true)
    private void handleUpdateTags_1582879807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1582879807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCodeOfConduct(Lnet/minecraft/network/protocol/configuration/ClientboundCodeOfConductPacket;)V", cancellable = true)
    private void handleCodeOfConduct_2126674808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2126674808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1258249057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258249057L))
            info.setReturnValue(false);
    }


}
