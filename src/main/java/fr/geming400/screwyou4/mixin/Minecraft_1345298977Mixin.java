package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Minecraft.class)
public class Minecraft_1345298977Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private static void getInstance_153553353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153553353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/client/gui/screens/Screen;ZZ)V", cancellable = true)
    private void disconnect_1441182258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1441182258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/client/gui/screens/Screen;Z)V", cancellable = true)
    private void disconnect__1978134306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1978134306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel__1986265202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1986265202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConnection()Lnet/minecraft/client/multiplayer/ClientPacketListener;", cancellable = true)
    private void getConnection__1400028200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400028200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "services()Lnet/minecraft/server/Services;", cancellable = true)
    private void services_233347150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233347150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getCameraEntity__1120779866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120779866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNarrator()Lnet/minecraft/client/GameNarrator;", cancellable = true)
    private void getNarrator__2098051719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098051719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showDebugChat(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void showDebugChat__555879961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555879961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasShiftDown()Z", cancellable = true)
    private void hasShiftDown_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastInputType(Lnet/minecraft/client/InputType;)V", cancellable = true)
    private void setLastInputType_1792714670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792714670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reloadResourcePacks()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reloadResourcePacks__1236293059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236293059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugOverlay()Lnet/minecraft/client/gui/components/DebugScreenOverlay;", cancellable = true)
    private void getDebugOverlay_498452008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498452008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFramerateLimitTracker()Lcom/mojang/blaze3d/platform/FramerateLimitTracker;", cancellable = true)
    private void getFramerateLimitTracker_562938667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562938667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSwitchGameMode()Z", cancellable = true)
    private void canSwitchGameMode_1383578055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383578055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureManager()Lnet/minecraft/client/renderer/texture/TextureManager;", cancellable = true)
    private void getTextureManager__1776038388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1776038388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canInterruptScreen()Z", cancellable = true)
    private void canInterruptScreen_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugClientMetricsStart(Ljava/util/function/Consumer;)Z", cancellable = true)
    private void debugClientMetricsStart_2026319233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026319233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasControlDown()Z", cancellable = true)
    private void hasControlDown_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textInputManager()Lcom/mojang/blaze3d/platform/TextInputManager;", cancellable = true)
    private void textInputManager_886451085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886451085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleGlobalKeyPress(Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)Z", cancellable = true)
    private void handleGlobalKeyPress__1000354973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1000354973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmsDataFetcher()Lcom/mojang/realmsclient/gui/RealmsDataFetcher;", cancellable = true)
    private void realmsDataFetcher_180206768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180206768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickPlayLog()Lnet/minecraft/client/quickplay/QuickPlayLog;", cancellable = true)
    private void quickPlayLog__170470493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170470493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__1914985390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914985390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowsMultiplayer()Z", cancellable = true)
    private void allowsMultiplayer_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "windowSurface()Lcom/mojang/blaze3d/systems/GpuSurface;", cancellable = true)
    private void windowSurface__109461555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109461555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocalServer()Z", cancellable = true)
    private void isLocalServer_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directoryValidator()Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private void directoryValidator_720287013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720287013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packetProcessor()Lnet/minecraft/network/PacketProcessor;", cancellable = true)
    private void packetProcessor_219289551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219289551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isGameLoadFinished()Z", cancellable = true)
    private void isGameLoadFinished_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emergencySaveAndCrash(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void emergencySaveAndCrash_177943203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(177943203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLaunchedVersion()Ljava/lang/String;", cancellable = true)
    private void getLaunchedVersion_209838505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209838505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentServer()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getCurrentServer__292627950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292627950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOfflineDeveloperMode()Z", cancellable = true)
    private void isOfflineDeveloperMode_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateTitle()V", cancellable = true)
    private void updateTitle_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkModStatus()Lnet/minecraft/util/ModCheck;", cancellable = true)
    private static void checkModStatus_2109248381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109248381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearResourcePacksOnError(Ljava/lang/Throwable;Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/GameLoadCookie;)V", cancellable = true)
    private void clearResourcePacksOnError_859242783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859242783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasSingleplayerServer()Z", cancellable = true)
    private void hasSingleplayerServer_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelSource()Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private void getLevelSource__1412849044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412849044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnforceUnicode()Z", cancellable = true)
    private void isEnforceUnicode_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelManager()Lnet/minecraft/client/resources/model/ModelManager;", cancellable = true)
    private void getModelManager__1762442144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762442144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectPerTickGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerTickGizmos__1330362402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330362402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderFrame(Z)V", cancellable = true)
    private void renderFrame__1720051491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1720051491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exitWorldAndClose()V", cancellable = true)
    private void exitWorldAndClose_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSingleplayerServer()Lnet/minecraft/client/server/IntegratedServer;", cancellable = true)
    private void getSingleplayerServer__1854016100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854016100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithSavingScreen()V", cancellable = true)
    private void disconnectWithSavingScreen_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursorEntered()V", cancellable = true)
    private void cursorEntered_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFrameTimeNs()J", cancellable = true)
    private void getFrameTimeNs_1383562183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383562183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "framebufferSizeChanged()V", cancellable = true)
    private void framebufferSizeChanged_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMusicManager()Lnet/minecraft/client/sounds/MusicManager;", cancellable = true)
    private void getMusicManager__1833301621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833301621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetricsRecorder()Lnet/minecraft/util/profiling/metrics/profiling/MetricsRecorder;", cancellable = true)
    private void getMetricsRecorder_545626084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545626084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTelemetryManager()Lnet/minecraft/client/telemetry/ClientTelemetryManager;", cancellable = true)
    private void getTelemetryManager__1706184161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706184161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMultiplayerServer()Z", cancellable = true)
    private void isMultiplayerServer_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfileKeyPairManager()Lnet/minecraft/client/multiplayer/ProfileKeyPairManager;", cancellable = true)
    private void getProfileKeyPairManager__1111397642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111397642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGpuUtilization()D", cancellable = true)
    private void getGpuUtilization_1383556417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383556417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateReportEnvironment(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;)V", cancellable = true)
    private void updateReportEnvironment_1585233420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1585233420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWorldOpenFlows()Lnet/minecraft/client/gui/screens/worldselection/WorldOpenFlows;", cancellable = true)
    private void createWorldOpenFlows_237614236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237614236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doWorldLoad(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/packs/repository/PackRepository;Lnet/minecraft/server/WorldStem;Ljava/util/Optional;Z)V", cancellable = true)
    private void doWorldLoad__1629841740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1629841740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFriendOnlyRestricted(Ljava/util/UUID;)Z", cancellable = true)
    private void isFriendOnlyRestricted_987746731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987746731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCameraEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setCameraEntity_893574316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(893574316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowsRealms()Z", cancellable = true)
    private void allowsRealms_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "telemetryOptInExtra()Z", cancellable = true)
    private void telemetryOptInExtra_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setScreenAndShow(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void setScreenAndShow_405417138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405417138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearClientLevel(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void clearClientLevel_405417138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405417138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extraTelemetryAvailable()Z", cancellable = true)
    private void extraTelemetryAvailable_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friendsEnabled()Z", cancellable = true)
    private void friendsEnabled_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNameBanned()Z", cancellable = true)
    private void isNameBanned_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowFriendRequests()Z", cancellable = true)
    private void allowFriendRequests_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowChatOnlyWithFriend()Z", cancellable = true)
    private void allowChatOnlyWithFriend_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromWorld(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnectFromWorld__555879961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555879961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "multiplayerBan()Lcom/mojang/authlib/minecraft/BanDetails;", cancellable = true)
    private void multiplayerBan_8312974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8312974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowsTelemetry()Z", cancellable = true)
    private void allowsTelemetry_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeChatAbilities()Lnet/minecraft/client/multiplayer/chat/ChatAbilities;", cancellable = true)
    private void computeChatAbilities_1218276870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218276870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSocialManager()Lnet/minecraft/client/gui/screens/social/PlayerSocialManager;", cancellable = true)
    private void getPlayerSocialManager__707101957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707101957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLauncherBrand()Ljava/lang/String;", cancellable = true)
    private static void getLauncherBrand_209838753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209838753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGpuWarnlistManager()Lnet/minecraft/client/renderer/GpuWarnlistManager;", cancellable = true)
    private void getGpuWarnlistManager__693024747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693024747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockColors()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private void getBlockColors_1259976783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259976783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfileResult()Lcom/mojang/authlib/yggdrasil/ProfileResult;", cancellable = true)
    private void getProfileResult_1271292028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271292028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundManager()Lnet/minecraft/client/sounds/SoundManager;", cancellable = true)
    private void getSoundManager__82917387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82917387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__240917601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240917601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapTextureManager()Lnet/minecraft/client/resources/MapTextureManager;", cancellable = true)
    private void getMapTextureManager__690931014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690931014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getGameProfile_1862467256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862467256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSituationalMusic()Lnet/minecraft/sounds/Music;", cancellable = true)
    private void getSituationalMusic__39952768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39952768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapRenderer()Lnet/minecraft/client/renderer/MapRenderer;", cancellable = true)
    private void getMapRenderer__1979506207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979506207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFixerUpper()Lcom/mojang/datafixers/DataFixer;", cancellable = true)
    private void getFixerUpper__1005363919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005363919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDeltaTracker()Lnet/minecraft/client/DeltaTracker;", cancellable = true)
    private void getDeltaTracker__1695854572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695854572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showOnlyReducedInfo()Z", cancellable = true)
    private void showOnlyReducedInfo_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTutorial()Lnet/minecraft/client/tutorial/Tutorial;", cancellable = true)
    private void getTutorial__516540657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516540657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVanillaPackResources()Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private void getVanillaPackResources_1108806438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108806438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldEntityAppearGlowing(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldEntityAppearGlowing_893578160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893578160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTextInputFocusChange(Lnet/minecraft/client/gui/components/events/GuiEventListener;Z)V", cancellable = true)
    private void onTextInputFocusChange__1727944678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1727944678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getResourcePackDirectory_210935294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210935294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMusicVolume()F", cancellable = true)
    private void getMusicVolume_1383558339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383558339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkinManager()Lnet/minecraft/client/resources/SkinManager;", cancellable = true)
    private void getSkinManager__1916298792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916298792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWindowActive()Z", cancellable = true)
    private void isWindowActive_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHotbarManager()Lnet/minecraft/client/HotbarManager;", cancellable = true)
    private void getHotbarManager_1008211351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008211351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delayTextureReload()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void delayTextureReload__1236293059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236293059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAtlasManager()Lnet/minecraft/client/resources/model/sprite/AtlasManager;", cancellable = true)
    private void getAtlasManager_649536322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649536322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private void getResourcePackRepository__166071053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166071053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void getEntityRenderDispatcher_518437492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518437492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grabPanoramixScreenshot(Ljava/io/File;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void grabPanoramixScreenshot_2075228700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075228700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocalPlayer(Ljava/util/UUID;)Z", cancellable = true)
    private void isLocalPlayer_987746731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987746731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRunningThread()Ljava/lang/Thread;", cancellable = true)
    private void getRunningThread__1163115248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163115248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateMaxMipLevel(I)V", cancellable = true)
    private void updateMaxMipLevel__1735751348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1735751348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityModels()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void getEntityModels__439144971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439144971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void getResourceManager__2104822298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104822298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDownloadedPackSource()Lnet/minecraft/client/resources/server/DownloadedPackSource;", cancellable = true)
    private void getDownloadedPackSource_997594689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997594689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareForMultiplayer()V", cancellable = true)
    private void prepareForMultiplayer_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLanguageManager()Lnet/minecraft/client/resources/language/LanguageManager;", cancellable = true)
    private void getLanguageManager__392360884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392360884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShaderManager()Lnet/minecraft/client/renderer/ShaderManager;", cancellable = true)
    private void getShaderManager_899259832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899259832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastInputType()Lnet/minecraft/client/InputType;", cancellable = true)
    private void getLastInputType__601541382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601541382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPerTickGizmos()Ljava/util/Collection;", cancellable = true)
    private void getPerTickGizmos__468349296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468349296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReportingContext()Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;", cancellable = true)
    private void getReportingContext__111084102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111084102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void getItemModelResolver__504878190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504878190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidateSurfaceConfiguration()V", cancellable = true)
    private void invalidateSurfaceConfiguration_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReportAndShutdownSoundManager(Lnet/minecraft/client/Minecraft;Ljava/io/File;Lnet/minecraft/CrashReport;I)I", cancellable = true)
    private static void saveReportAndShutdownSoundManager_2025484944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025484944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerResourcePackRecovery(Ljava/lang/Exception;)V", cancellable = true)
    private void triggerResourcePackRecovery__2066428785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2066428785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithProgressScreen()V", cancellable = true)
    private void disconnectWithProgressScreen_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithProgressScreen(Z)V", cancellable = true)
    private void disconnectWithProgressScreen__1720051491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1720051491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearDownloadedResourcePacks()V", cancellable = true)
    private void clearDownloadedResourcePacks_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void getBlockEntityRenderDispatcher_797896786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797896786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWindow()Lcom/mojang/blaze3d/platform/Window;", cancellable = true)
    private void getWindow__1740691731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740691731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pauseGame(Z)V", cancellable = true)
    private void pauseGame__1720051491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1720051491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "crash(Lnet/minecraft/client/Minecraft;Ljava/io/File;Lnet/minecraft/CrashReport;I)V", cancellable = true)
    private static void crash_2025497437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2025497437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "delayCrash(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void delayCrash_177943203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(177943203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAltDown()Z", cancellable = true)
    private void hasAltDown_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillReport(Lnet/minecraft/CrashReport;)Lnet/minecraft/CrashReport;", cancellable = true)
    private void fillReport__611301843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611301843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillReport(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/resources/language/LanguageManager;Ljava/lang/String;Lnet/minecraft/client/Options;Lnet/minecraft/CrashReport;)V", cancellable = true)
    private static void fillReport_632216291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632216291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReport(Ljava/io/File;Lnet/minecraft/CrashReport;)V", cancellable = true)
    private static void saveReport__203978172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-203978172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReport(Ljava/io/File;Lnet/minecraft/CrashReport;I)I", cancellable = true)
    private static void saveReport_589727774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589727774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resizeGui()V", cancellable = true)
    private void resizeGui_1383573715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383573715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDemo()Z", cancellable = true)
    private void isDemo_1383578055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383578055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUser()Lnet/minecraft/client/User;", cancellable = true)
    private void getUser__1775384631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775384631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFps()I", cancellable = true)
    private void getFps_1383561222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383561222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPaused()Z", cancellable = true)
    private void isPaused_1383577559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383577559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlocked(Ljava/util/UUID;)Z", cancellable = true)
    private void isBlocked_987746731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987746731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProxy()Ljava/net/Proxy;", cancellable = true)
    private void getProxy_896556543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896556543L))
            info.setReturnValue(null);
    }


}
