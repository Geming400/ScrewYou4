package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.CommonListenerCookie.class)
public class CommonListenerCookie_519422225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1904934483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904934483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__616037751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616037751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_557684966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557684966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenPlayers()Ljava/util/Map;", cancellable = true)
    private void seenPlayers__1485201416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485201416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "telemetryManager()Lnet/minecraft/client/telemetry/WorldSessionTelemetryManager;", cancellable = true)
    private void telemetryManager_847424982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847424982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenInsecureChatWarning()Z", cancellable = true)
    private void seenInsecureChatWarning_557700807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557700807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverCookies()Ljava/util/Map;", cancellable = true)
    private void serverCookies__1485201416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485201416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postDisconnectScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void postDisconnectScreen__1930327844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930327844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customReportDetails()Ljava/util/Map;", cancellable = true)
    private void customReportDetails__1485201416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485201416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "receivedRegistries()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void receivedRegistries_270671959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270671959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "localGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void localGameProfile_1036590504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036590504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelLoadTracker()Lnet/minecraft/client/multiplayer/LevelLoadTracker;", cancellable = true)
    private void levelLoadTracker__1357771487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357771487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void serverData__1118504702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118504702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatState()Lnet/minecraft/client/gui/components/ChatComponent$State;", cancellable = true)
    private void chatState__1297383465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297383465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverLinks()Lnet/minecraft/server/ServerLinks;", cancellable = true)
    private void serverLinks_657669856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657669856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverBrand()Ljava/lang/String;", cancellable = true)
    private void serverBrand__616038247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616038247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures_1184242722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184242722L))
            info.setReturnValue(null);
    }


}
