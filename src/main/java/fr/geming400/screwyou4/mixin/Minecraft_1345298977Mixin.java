package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Minecraft.class)
public class Minecraft_1345298977Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_2108411176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2108411176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/client/Minecraft;", cancellable = true)
    private static void getInstance_1909256788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909256788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1372564975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1372564975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__769276453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-769276453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/client/gui/screens/Screen;Z)V", cancellable = true)
    private void disconnect__1342546750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1342546750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/client/gui/screens/Screen;ZZ)V", cancellable = true)
    private void disconnect__330439986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-330439986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1215615318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1215615318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1371165634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371165634L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_1853943820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1853943820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getConnection()Lnet/minecraft/client/multiplayer/ClientPacketListener;", cancellable = true)
    private void getConnection__1384990588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384990588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "services()Lnet/minecraft/server/Services;", cancellable = true)
    private void services__900711632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900711632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocalPlayer(Ljava/util/UUID;)Z", cancellable = true)
    private void isLocalPlayer__411425719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411425719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getGameProfile_614492761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614492761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_1534630537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534630537L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundManager()Lnet/minecraft/client/sounds/SoundManager;", cancellable = true)
    private void getSoundManager__811911415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811911415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeChatAbilities()Lnet/minecraft/client/multiplayer/chat/ChatAbilities;", cancellable = true)
    private void computeChatAbilities_859618381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859618381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTutorial()Lnet/minecraft/client/tutorial/Tutorial;", cancellable = true)
    private void getTutorial_1916449251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916449251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getCameraEntity_1799884296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799884296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasShiftDown()Z", cancellable = true)
    private void hasShiftDown__113207475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113207475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showDebugChat(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void showDebugChat__1894314151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1894314151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugOverlay()Lnet/minecraft/client/gui/components/DebugScreenOverlay;", cancellable = true)
    private void getDebugOverlay__1989491557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989491557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugClientMetricsStart(Ljava/util/function/Consumer;)Z", cancellable = true)
    private void debugClientMetricsStart__1972676930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972676930L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTextureManager()Lnet/minecraft/client/renderer/texture/TextureManager;", cancellable = true)
    private void getTextureManager__1850462444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850462444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSwitchGameMode()Z", cancellable = true)
    private void canSwitchGameMode_1375016302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375016302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "reloadResourcePacks()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reloadResourcePacks_1300078256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300078256L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "canInterruptScreen()Z", cancellable = true)
    private void canInterruptScreen__1715030920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715030920L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "textInputManager()Lcom/mojang/blaze3d/platform/TextInputManager;", cancellable = true)
    private void textInputManager__2068050467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068050467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasControlDown()Z", cancellable = true)
    private void hasControlDown__2113143214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113143214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleGlobalKeyPress(Lcom/mojang/blaze3d/platform/InputConstants$Key;Z)Z", cancellable = true)
    private void handleGlobalKeyPress_615814226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615814226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFramerateLimitTracker()Lcom/mojang/blaze3d/platform/FramerateLimitTracker;", cancellable = true)
    private void getFramerateLimitTracker_247433975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247433975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastInputType(Lnet/minecraft/client/InputType;)V", cancellable = true)
    private void setLastInputType__1263719358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1263719358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "realmsDataFetcher()Lcom/mojang/realmsclient/gui/RealmsDataFetcher;", cancellable = true)
    private void realmsDataFetcher_1621034135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621034135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quickPlayLog()Lnet/minecraft/client/quickplay/QuickPlayLog;", cancellable = true)
    private void quickPlayLog__1455973056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455973056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__539783324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539783324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowsMultiplayer()Z", cancellable = true)
    private void allowsMultiplayer__1482107609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482107609L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "windowSurface()Lcom/mojang/blaze3d/systems/GpuSurface;", cancellable = true)
    private void windowSurface__819084016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819084016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packetProcessor()Lnet/minecraft/network/PacketProcessor;", cancellable = true)
    private void packetProcessor__1165971291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165971291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directoryValidator()Lnet/minecraft/world/level/validation/DirectoryValidator;", cancellable = true)
    private void directoryValidator__783210528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783210528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFixerUpper()Lcom/mojang/datafixers/DataFixer;", cancellable = true)
    private void getFixerUpper_1737886907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737886907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlocked(Ljava/util/UUID;)Z", cancellable = true)
    private void isBlocked_1728756105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728756105L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void getBlockEntityRenderDispatcher_1623486811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623486811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invalidateSurfaceConfiguration()V", cancellable = true)
    private void invalidateSurfaceConfiguration_1367936047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1367936047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearDownloadedResourcePacks()V", cancellable = true)
    private void clearDownloadedResourcePacks__1157479749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1157479749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReportAndShutdownSoundManager(Lnet/minecraft/client/Minecraft;Ljava/io/File;Lnet/minecraft/CrashReport;I)I", cancellable = true)
    private static void saveReportAndShutdownSoundManager_272506390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272506390L))
            info.setReturnValue(-656150030);
    }

    @Inject(at = @At("HEAD"), method = "triggerResourcePackRecovery(Ljava/lang/Exception;)V", cancellable = true)
    private void triggerResourcePackRecovery__560826013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-560826013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithProgressScreen()V", cancellable = true)
    private void disconnectWithProgressScreen__572491624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-572491624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithProgressScreen(Z)V", cancellable = true)
    private void disconnectWithProgressScreen_2066432440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2066432440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateTitle()V", cancellable = true)
    private void updateTitle__1764775132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1764775132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isGameLoadFinished()Z", cancellable = true)
    private void isGameLoadFinished_2079626883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079626883L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "checkModStatus()Lnet/minecraft/util/ModCheck;", cancellable = true)
    private static void checkModStatus__1902120047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902120047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentServer()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getCurrentServer__620563348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620563348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelSource()Lnet/minecraft/world/level/storage/LevelStorageSource;", cancellable = true)
    private void getLevelSource_517863605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517863605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exitWorldAndClose()V", cancellable = true)
    private void exitWorldAndClose__631925154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-631925154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOfflineDeveloperMode()Z", cancellable = true)
    private void isOfflineDeveloperMode_212219043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212219043L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearResourcePacksOnError(Ljava/lang/Throwable;Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/GameLoadCookie;)V", cancellable = true)
    private void clearResourcePacksOnError_450338229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(450338229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEnforceUnicode()Z", cancellable = true)
    private void isEnforceUnicode_1247729298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247729298L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "collectPerTickGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerTickGizmos_1104102229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104102229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelManager()Lnet/minecraft/client/resources/model/ModelManager;", cancellable = true)
    private void getModelManager__394023834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394023834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emergencySaveAndCrash(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void emergencySaveAndCrash_1579049857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579049857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLaunchedVersion()Ljava/lang/String;", cancellable = true)
    private void getLaunchedVersion__1006506919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006506919L))
            info.setReturnValue("auX0[PG\u8CFFKs\u1443.fxbm");
    }

    @Inject(at = @At("HEAD"), method = "disconnectWithSavingScreen()V", cancellable = true)
    private void disconnectWithSavingScreen__317463253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-317463253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasSingleplayerServer()Z", cancellable = true)
    private void hasSingleplayerServer_2136427921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136427921L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cursorEntered()V", cancellable = true)
    private void cursorEntered_867882034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867882034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFrameTimeNs()J", cancellable = true)
    private void getFrameTimeNs_378824030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378824030L))
            info.setReturnValue(1544961390418029187L);
    }

    @Inject(at = @At("HEAD"), method = "getSingleplayerServer()Lnet/minecraft/client/server/IntegratedServer;", cancellable = true)
    private void getSingleplayerServer__1963932450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963932450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "framebufferSizeChanged()V", cancellable = true)
    private void framebufferSizeChanged_1881248589(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1881248589L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderFrame(Z)V", cancellable = true)
    private void renderFrame__1471944428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1471944428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendLowDiskSpaceWarning()V", cancellable = true)
    private void sendLowDiskSpaceWarning__672306316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-672306316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTelemetryManager()Lnet/minecraft/client/telemetry/ClientTelemetryManager;", cancellable = true)
    private void getTelemetryManager__1666550091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666550091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMetricsRecorder()Lnet/minecraft/util/profiling/metrics/profiling/MetricsRecorder;", cancellable = true)
    private void getMetricsRecorder_1714994895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714994895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGpuUtilization()D", cancellable = true)
    private void getGpuUtilization_1247254005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247254005L))
            info.setReturnValue(6.433744009492968E8D);
    }

    @Inject(at = @At("HEAD"), method = "getProfileKeyPairManager()Lnet/minecraft/client/multiplayer/ProfileKeyPairManager;", cancellable = true)
    private void getProfileKeyPairManager__944492963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944492963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMultiplayerServer()Z", cancellable = true)
    private void isMultiplayerServer__1103756668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103756668L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMusicManager()Lnet/minecraft/client/sounds/MusicManager;", cancellable = true)
    private void getMusicManager_268588361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268588361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNameBanned()Z", cancellable = true)
    private void isNameBanned_500901220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500901220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createWorldOpenFlows()Lnet/minecraft/client/gui/screens/worldselection/WorldOpenFlows;", cancellable = true)
    private void createWorldOpenFlows__1507386463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507386463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setScreenAndShow(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void setScreenAndShow_1732593752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1732593752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doWorldLoad(Lnet/minecraft/world/level/storage/LevelStorageSource$LevelStorageAccess;Lnet/minecraft/server/packs/repository/PackRepository;Lnet/minecraft/server/WorldStem;Ljava/util/Optional;Z)V", cancellable = true)
    private void doWorldLoad__479363065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-479363065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateReportEnvironment(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;)V", cancellable = true)
    private void updateReportEnvironment__41977514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-41977514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowsTelemetry()Z", cancellable = true)
    private void allowsTelemetry_523159720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523159720L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "multiplayerBan()Lcom/mojang/authlib/minecraft/BanDetails;", cancellable = true)
    private void multiplayerBan_1805840985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805840985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearClientLevel(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void clearClientLevel_629079454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629079454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerSocialManager()Lnet/minecraft/client/gui/screens/social/PlayerSocialManager;", cancellable = true)
    private void getPlayerSocialManager_387509554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387509554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friendsEnabled()Z", cancellable = true)
    private void friendsEnabled__1728711829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728711829L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromWorld(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnectFromWorld_1431463323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431463323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCameraEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setCameraEntity_970627990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(970627990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "telemetryOptInExtra()Z", cancellable = true)
    private void telemetryOptInExtra_1246873126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246873126L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowsRealms()Z", cancellable = true)
    private void allowsRealms__1791268375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791268375L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extraTelemetryAvailable()Z", cancellable = true)
    private void extraTelemetryAvailable_1578282135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578282135L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLauncherBrand()Ljava/lang/String;", cancellable = true)
    private static void getLauncherBrand_907860978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907860978L))
            info.setReturnValue(">&bSYpT]P\u2EBD#\u63C0X!F1");
    }

    @Inject(at = @At("HEAD"), method = "isFriendOnlyRestricted(Ljava/util/UUID;)Z", cancellable = true)
    private void isFriendOnlyRestricted_170751324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170751324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGpuWarnlistManager()Lnet/minecraft/client/renderer/GpuWarnlistManager;", cancellable = true)
    private void getGpuWarnlistManager__1262633368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262633368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowChatOnlyWithFriend()Z", cancellable = true)
    private void allowChatOnlyWithFriend_1870324230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870324230L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "allowFriendRequests()Z", cancellable = true)
    private void allowFriendRequests_1659686540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659686540L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastInputType()Lnet/minecraft/client/InputType;", cancellable = true)
    private void getLastInputType_876515698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876515698L))
            info.setReturnValue(net.minecraft.client.InputType.KEYBOARD_ARROW);
    }

    @Inject(at = @At("HEAD"), method = "showOnlyReducedInfo()Z", cancellable = true)
    private void showOnlyReducedInfo__1824880588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824880588L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVanillaPackResources()Lnet/minecraft/server/packs/VanillaPackResources;", cancellable = true)
    private void getVanillaPackResources_1800331455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800331455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLanguageManager()Lnet/minecraft/client/resources/language/LanguageManager;", cancellable = true)
    private void getLanguageManager__1101624915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101624915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapRunnable(Ljava/lang/Runnable;)Ljava/lang/Runnable;", cancellable = true)
    private void wrapRunnable__403893594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403893594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockColors()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private void getBlockColors__1239099466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239099466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delayTextureReload()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void delayTextureReload__2130838898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130838898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkinManager()Lnet/minecraft/client/resources/SkinManager;", cancellable = true)
    private void getSkinManager_1868681234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868681234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWindowActive()Z", cancellable = true)
    private void isWindowActive__569536905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569536905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHotbarManager()Lnet/minecraft/client/HotbarManager;", cancellable = true)
    private void getHotbarManager__759421688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759421688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void getEntityRenderDispatcher_1862989662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862989662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShaderManager()Lnet/minecraft/client/renderer/ShaderManager;", cancellable = true)
    private void getShaderManager_567321510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567321510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSituationalMusic()Lnet/minecraft/sounds/Music;", cancellable = true)
    private void getSituationalMusic_1321754354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321754354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getResourcePackDirectory_566295342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566295342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourcePackRepository()Lnet/minecraft/server/packs/repository/PackRepository;", cancellable = true)
    private void getResourcePackRepository__634741990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634741990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareForMultiplayer()V", cancellable = true)
    private void prepareForMultiplayer__952752613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952752613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReportingContext()Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;", cancellable = true)
    private void getReportingContext_1363905347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363905347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDownloadedPackSource()Lnet/minecraft/client/resources/server/DownloadedPackSource;", cancellable = true)
    private void getDownloadedPackSource_1692464338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692464338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMusicVolume()F", cancellable = true)
    private void getMusicVolume__2070270470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070270470L))
            info.setReturnValue(6.453745E8F);
    }

    @Inject(at = @At("HEAD"), method = "getItemModelResolver()Lnet/minecraft/client/renderer/item/ItemModelResolver;", cancellable = true)
    private void getItemModelResolver__89465512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89465512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTextInputFocusChange(Lnet/minecraft/client/gui/components/events/GuiEventListener;Z)V", cancellable = true)
    private void onTextInputFocusChange__935383152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-935383152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMapRenderer()Lnet/minecraft/client/renderer/MapRenderer;", cancellable = true)
    private void getMapRenderer__1677214280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677214280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateMaxMipLevel(I)V", cancellable = true)
    private void updateMaxMipLevel__11551849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11551849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRunningThread()Ljava/lang/Thread;", cancellable = true)
    private void getRunningThread_88604099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88604099L))
            info.setReturnValue(new java.lang.Thread());
    }

    @Inject(at = @At("HEAD"), method = "getDeltaTracker()Lnet/minecraft/client/DeltaTracker;", cancellable = true)
    private void getDeltaTracker__52902786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52902786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAtlasManager()Lnet/minecraft/client/resources/model/sprite/AtlasManager;", cancellable = true)
    private void getAtlasManager__1771955110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771955110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldEntityAppearGlowing(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldEntityAppearGlowing_579037626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579037626L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMapTextureManager()Lnet/minecraft/client/resources/MapTextureManager;", cancellable = true)
    private void getMapTextureManager_794017426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794017426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfileResult()Lcom/mojang/authlib/yggdrasil/ProfileResult;", cancellable = true)
    private void getProfileResult_1159927788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159927788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grabPanoramixScreenshot(Ljava/io/File;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void grabPanoramixScreenshot_92126865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92126865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityModels()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void getEntityModels_1495550232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495550232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPerTickGizmos()Ljava/util/Collection;", cancellable = true)
    private void getPerTickGizmos__981368371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981368371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNarrator()Lnet/minecraft/client/GameNarrator;", cancellable = true)
    private void getNarrator_1981809690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981809690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWindow()Lcom/mojang/blaze3d/platform/Window;", cancellable = true)
    private void getWindow__957167661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957167661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUser()Lnet/minecraft/client/User;", cancellable = true)
    private void getUser_320678760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320678760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pauseGame(Z)V", cancellable = true)
    private void pauseGame__1150439963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1150439963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "delayCrash(Lnet/minecraft/CrashReport;)V", cancellable = true)
    private void delayCrash__914499961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-914499961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "crash(Lnet/minecraft/client/Minecraft;Ljava/io/File;Lnet/minecraft/CrashReport;I)V", cancellable = true)
    private static void crash__1740679978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1740679978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReport(Ljava/io/File;Lnet/minecraft/CrashReport;)V", cancellable = true)
    private static void saveReport__1128036971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1128036971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveReport(Ljava/io/File;Lnet/minecraft/CrashReport;I)I", cancellable = true)
    private static void saveReport_2008676077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008676077L))
            info.setReturnValue(1893077899);
    }

    @Inject(at = @At("HEAD"), method = "fillReport(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/resources/language/LanguageManager;Ljava/lang/String;Lnet/minecraft/client/Options;Lnet/minecraft/CrashReport;)V", cancellable = true)
    private static void fillReport_301914156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301914156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillReport(Lnet/minecraft/CrashReport;)Lnet/minecraft/CrashReport;", cancellable = true)
    private void fillReport_1906824196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906824196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resizeGui()V", cancellable = true)
    private void resizeGui_559984972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(559984972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasAltDown()Z", cancellable = true)
    private void hasAltDown__1024955258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024955258L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPaused()Z", cancellable = true)
    private void isPaused__1456060449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456060449L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProxy()Ljava/net/Proxy;", cancellable = true)
    private void getProxy_1128678071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128678071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFps()I", cancellable = true)
    private void getFps_453038643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453038643L))
            info.setReturnValue(-1437098298);
    }

    @Inject(at = @At("HEAD"), method = "isDemo()Z", cancellable = true)
    private void isDemo__1028115526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028115526L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getResourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void getResourceManager_440660527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440660527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocalServer()Z", cancellable = true)
    private void isLocalServer_1143660371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143660371L))
            info.setReturnValue(true);
    }


}
