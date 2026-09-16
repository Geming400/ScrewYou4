package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.CommonListenerCookie.class)
public class CommonListenerCookie_519422225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__389204044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-389204044L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1289845749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289845749L))
            info.setReturnValue("c");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1076774315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076774315L))
            info.setReturnValue(-2050197241);
    }

    @Inject(at = @At("HEAD"), method = "seenInsecureChatWarning()Z", cancellable = true)
    private void seenInsecureChatWarning_1159946938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159946938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "serverCookies()Ljava/util/Map;", cancellable = true)
    private void serverCookies_1013336748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013336748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customReportDetails()Ljava/util/Map;", cancellable = true)
    private void customReportDetails__167356837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167356837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postDisconnectScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void postDisconnectScreen_866493684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866493684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelLoadTracker()Lnet/minecraft/client/multiplayer/LevelLoadTracker;", cancellable = true)
    private void levelLoadTracker__1863991277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863991277L))
            info.setReturnValue(new net.minecraft.client.multiplayer.LevelLoadTracker());
    }

    @Inject(at = @At("HEAD"), method = "localGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void localGameProfile_16220308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16220308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "receivedRegistries()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void receivedRegistries_422438323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422438323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatState()Lnet/minecraft/client/gui/components/ChatComponent$State;", cancellable = true)
    private void chatState__125579682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125579682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1648442812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648442812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverBrand()Ljava/lang/String;", cancellable = true)
    private void serverBrand_991634333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991634333L))
            info.setReturnValue("L1%x\u18F0u;oXPR qLMj_:G2!X\uCE54)\u4123ZS\"hE\uCABE%iEuLK|L\uD298\u035F,hQgJ_z\uD72An19xI");
    }

    @Inject(at = @At("HEAD"), method = "serverData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void serverData_553606933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553606933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serverLinks()Lnet/minecraft/server/ServerLinks;", cancellable = true)
    private void serverLinks__1797379946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797379946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "telemetryManager()Lnet/minecraft/client/telemetry/WorldSessionTelemetryManager;", cancellable = true)
    private void telemetryManager_525202082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525202082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenPlayers()Ljava/util/Map;", cancellable = true)
    private void seenPlayers__2017246239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017246239L))
            info.setReturnValue(null);
    }


}
