package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Options.class)
public class Options1222564432Mixin {
        @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load__1735836707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1735836707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1353680294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353680294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFile()Ljava/io/File;", cancellable = true)
    private void getFile__1518799368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518799368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudRange()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cloudRange__1619734926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619734926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fov()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fov_71640909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71640909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narrator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void narrator__1055824751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055824751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullscreen()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fullscreen__137208801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137208801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void guiScale_1596656011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596656011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatWidth()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatWidth_1784543212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784543212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintSpeed()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void glintSpeed__1876243299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876243299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleUse()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleUse_1005676871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005676871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bobView()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void bobView_1630494912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630494912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatScale_1538973928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538973928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatDelay()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatDelay__851704625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851704625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLinks()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLinks_1367565145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367565145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particles()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void particles__298357395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298357395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reducedDebugInfo()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void reducedDebugInfo__1029444265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029444265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatVisibility()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatVisibility_1384663088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384663088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainHand()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mainHand__598403918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598403918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatColors()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatColors_745976722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745976722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprintWindow()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sprintWindow__1525915120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525915120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateWithMinecart()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void rotateWithMinecart_2116885030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116885030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraType()Lnet/minecraft/client/CameraType;", cancellable = true)
    private void getCameraType_1365972016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365972016L))
            info.setReturnValue(net.minecraft.client.CameraType.THIRD_PERSON_BACK);
    }

    @Inject(at = @At("HEAD"), method = "autoJump()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void autoJump_245662621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245662621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inactivityFpsLimit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void inactivityFpsLimit__1675425644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675425644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkSectionFadeInTime()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chunkSectionFadeInTime_693072692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693072692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrastBlockOutline()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void highContrastBlockOutline__1344266815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344266815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideLightningFlash()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideLightningFlash__595268270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595268270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport__512974180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512974180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chatLinksPrompt()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLinksPrompt__1721434347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721434347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "japaneseGlyphVariants()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void japaneseGlyphVariants__1466873359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466873359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatHeightUnfocused()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatHeightUnfocused__919818885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919818885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackIndicator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void attackIndicator__705900365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705900365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationDisplayTime()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void notificationDisplayTime__1703003850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1703003850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrast()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void highContrast__1818950858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818950858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowServerListing()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void allowServerListing__257772670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257772670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inGameNotification()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void inGameNotification_779339384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779339384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideSplashTexts()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideSplashTexts_916730365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916730365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "panoramaSpeed()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void panoramaSpeed_179065576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179065576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorItemsTab()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void operatorItemsTab__113191647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113191647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatHeightFocused()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatHeightFocused__2008627038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008627038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmsNotifications()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void realmsNotifications__1800576394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800576394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sharePresence()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sharePresence_110340288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110340288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showSubtitles()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void showSubtitles__1920322980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920322980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directionalAudio()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void directionalAudio__1302591250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302591250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundForChatOnly()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void backgroundForChatOnly__2069538981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069538981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleCrouch()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleCrouch__1909741812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909741812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLineSpacing()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLineSpacing_1263154211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263154211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "autoSuggestions()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void autoSuggestions_495383482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495383482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleSprint()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleSprint_1379567276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379567276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleAttack()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleAttack__150886850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150886850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enableVsync()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void enableVsync_155944172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155944172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceUnicodeFont()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void forceUnicodeFont_949709241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949709241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpOptionsForReport()Ljava/lang/String;", cancellable = true)
    private void dumpOptionsForReport__1813019124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1813019124L))
            info.setReturnValue("\u340AVMgT\uFCB6#?OZ\uA318>a7H\u1EEEm{\uB1B7\u7D1A#l]Q5(\uBE47N}+5[``@RH:VN[omy-sti'");
    }

    @Inject(at = @At("HEAD"), method = "setCameraType(Lnet/minecraft/client/CameraType;)V", cancellable = true)
    private void setCameraType__1076866612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1076866612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "telemetryOptInExtra()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void telemetryOptInExtra_1531116617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531116617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseWheelSensitivity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mouseWheelSensitivity__1883939695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883939695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invertMouseY()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void invertMouseY__1600567056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1600567056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invertMouseX()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void invertMouseX__1724640303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724640303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sensitivity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sensitivity_83839419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83839419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discreteMouseScroll()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void discreteMouseScroll_502124161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502124161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gamma()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void gamma_686783923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686783923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutLeaves()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cutoutLeaves__1163646734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163646734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "musicToast()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void musicToast__994104136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994104136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void simulationDistance__135775778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135775778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "menuBackgroundBlurriness()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void menuBackgroundBlurriness__1474202696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1474202696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "graphicsPreset()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void graphicsPreset_1615298416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615298416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preferredGraphicsBackend()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void preferredGraphicsBackend_67198898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67198898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderDistance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void renderDistance_1780959791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780959791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEffectiveRenderDistance()I", cancellable = true)
    private void getEffectiveRenderDistance_165790906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165790906L))
            info.setReturnValue(-1631271396);
    }

    @Inject(at = @At("HEAD"), method = "fovEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fovEffectScale__854364210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854364210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor(F)I", cancellable = true)
    private void getBackgroundColor__2068717685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068717685L))
            info.setReturnValue(1023010754);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor(I)I", cancellable = true)
    private void getBackgroundColor__2065947122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065947122L))
            info.setReturnValue(585318626);
    }

    @Inject(at = @At("HEAD"), method = "chatOpacity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatOpacity__1311030969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311030969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackgroundOpacity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void textBackgroundOpacity_1771953706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771953706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vignette()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void vignette_507242880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507242880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weatherRadius()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void weatherRadius_1947824788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947824788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "improvedTransparency()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void improvedTransparency_1220169878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220169878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narratorHotkey()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void narratorHotkey_289971327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289971327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exclusiveFullscreen()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void exclusiveFullscreen_415853729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415853729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyGraphicsPreset(Lnet/minecraft/client/GraphicsPreset;)V", cancellable = true)
    private void applyGraphicsPreset_452577912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(452577912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadSelectedResourcePacks(Lnet/minecraft/server/packs/repository/PackRepository;)V", cancellable = true)
    private void loadSelectedResourcePacks__1422982772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1422982772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowCursorChanges()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void allowCursorChanges_1684500534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684500534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rawMouseInput()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void rawMouseInput__333972563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333972563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darkMojangStudiosBackground()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void darkMojangStudiosBackground__206088585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206088585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRestartRequiredToApplyVideoSettings()Z", cancellable = true)
    private void isRestartRequiredToApplyVideoSettings_1661882424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661882424L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSourceOptionInstance(Lnet/minecraft/sounds/SoundSource;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void getSoundSourceOptionInstance_218528744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218528744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onboardingAccessibilityFinished()V", cancellable = true)
    private void onboardingAccessibilityFinished_818162590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(818162590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMenuBackgroundBlurriness()I", cancellable = true)
    private void getMenuBackgroundBlurriness__1500796482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500796482L))
            info.setReturnValue(905215548);
    }

    @Inject(at = @At("HEAD"), method = "framerateLimit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void framerateLimit_632992076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632992076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFinalSoundSourceVolume(Lnet/minecraft/sounds/SoundSource;)F", cancellable = true)
    private void getFinalSoundSourceVolume_1121428443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121428443L))
            info.setReturnValue(1.770025E8F);
    }

    @Inject(at = @At("HEAD"), method = "ambientOcclusion()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void ambientOcclusion__381845691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381845691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeBlendRadius()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void biomeBlendRadius__1866734249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866734249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudStatus()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cloudStatus_222957267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222957267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAnisotropyBit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void maxAnisotropyBit__255393805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255393805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureFiltering()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void textureFiltering__756005941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-756005941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mipmapLevels()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mipmapLevels_1269073219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269073219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityShadows()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void entityShadows__720712310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720712310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prioritizeChunkUpdates()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void prioritizeChunkUpdates__935861762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935861762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityDistanceScaling()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void entityDistanceScaling_494618347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494618347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showAutosaveIndicator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void showAutosaveIndicator__2099494412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099494412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideMatchedNames()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideMatchedNames_108581204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108581204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "screenEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void screenEffectScale__1782029843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782029843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateResourcePacks(Lnet/minecraft/server/packs/repository/PackRepository;)V", cancellable = true)
    private void updateResourcePacks_752188596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(752188596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveChatDrafts()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void saveChatDrafts_1292801939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292801939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAnisotropyValue()I", cancellable = true)
    private void maxAnisotropyValue__61802549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61802549L))
            info.setReturnValue(943593062);
    }

    @Inject(at = @At("HEAD"), method = "damageTiltStrength()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void damageTiltStrength_1172911341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172911341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintStrength()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void glintStrength_995216015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995216015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darknessEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void darknessEffectScale_245805518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245805518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "musicFrequency()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void musicFrequency__1529294173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529294173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyShowSecureChat()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void onlyShowSecureChat_666404706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666404706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSourceVolume(Lnet/minecraft/sounds/SoundSource;)F", cancellable = true)
    private void getSoundSourceVolume__1651961487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651961487L))
            info.setReturnValue(1.780028E8F);
    }

    @Inject(at = @At("HEAD"), method = "isSoundDeviceDefault(Ljava/lang/String;)Z", cancellable = true)
    private static void isSoundDeviceDefault__1107412669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107412669L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "soundDevice()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void soundDevice_1801907925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801907925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericValueOrOffLabel(Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueOrOffLabel__2039655916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039655916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundOpacity(F)F", cancellable = true)
    private void getBackgroundOpacity_1600479216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600479216L))
            info.setReturnValue(1.780028E8F);
    }

    @Inject(at = @At("HEAD"), method = "setServerRenderDistance(I)V", cancellable = true)
    private void setServerRenderDistance_1457075916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1457075916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isModelPartEnabled(Lnet/minecraft/world/entity/player/PlayerModelPart;)Z", cancellable = true)
    private void isModelPartEnabled_369170373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369170373L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "broadcastOptions()V", cancellable = true)
    private void broadcastOptions__824512378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-824512378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCloudStatus()Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private void getCloudStatus_1266764088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266764088L))
            info.setReturnValue(net.minecraft.client.CloudStatus.FANCY);
    }

    @Inject(at = @At("HEAD"), method = "buildPlayerInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void buildPlayerInformation__582431299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582431299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setModelPart(Lnet/minecraft/world/entity/player/PlayerModelPart;Z)V", cancellable = true)
    private void setModelPart__892019420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892019420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "genericValueLabel(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueLabel__342830227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342830227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericValueLabel(Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueLabel__1558313188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558313188L))
            info.setReturnValue(null);
    }


}
