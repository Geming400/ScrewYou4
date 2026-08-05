package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Options.class)
public class Options1222564432Mixin {
        @Inject(at = @At("HEAD"), method = "load()V", cancellable = true)
    private void load_1260839171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1260839171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_1260839171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1260839171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFile()Ljava/io/File;", cancellable = true)
    private void getFile__1691979642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691979642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCloudStatus()Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private void getCloudStatus__1621350233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1621350233L))
            info.setReturnValue(net.minecraft.client.CloudStatus.FAST);
    }

    @Inject(at = @At("HEAD"), method = "setServerRenderDistance(I)V", cancellable = true)
    private void setServerRenderDistance__1858485892(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1858485892L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "genericValueLabel(Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueLabel__1747067626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747067626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericValueLabel(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueLabel_422515123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422515123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "broadcastOptions()V", cancellable = true)
    private void broadcastOptions_1260839171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1260839171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildPlayerInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void buildPlayerInformation_290674752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290674752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isModelPartEnabled(Lnet/minecraft/world/entity/player/PlayerModelPart;)Z", cancellable = true)
    private void isModelPartEnabled_1264743062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264743062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundOpacity(F)F", cancellable = true)
    private void getBackgroundOpacity__1861271831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861271831L))
            info.setReturnValue(2.972249E8F);
    }

    @Inject(at = @At("HEAD"), method = "setModelPart(Lnet/minecraft/world/entity/player/PlayerModelPart;Z)V", cancellable = true)
    private void setModelPart__1721884578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1721884578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fullscreen()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fullscreen__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gamma()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void gamma__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weatherRadius()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void weatherRadius__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "improvedTransparency()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void improvedTransparency__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cutoutLeaves()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cutoutLeaves__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particles()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void particles__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reducedDebugInfo()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void reducedDebugInfo__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatVisibility()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatVisibility__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simulationDistance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void simulationDistance__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "menuBackgroundBlurriness()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void menuBackgroundBlurriness__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textBackgroundOpacity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void textBackgroundOpacity__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatOpacity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatOpacity__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor(F)I", cancellable = true)
    private void getBackgroundColor__1861268948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861268948L))
            info.setReturnValue(1705591338);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundColor(I)I", cancellable = true)
    private void getBackgroundColor__1858498385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858498385L))
            info.setReturnValue(-89914119);
    }

    @Inject(at = @At("HEAD"), method = "musicToast()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void musicToast__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fovEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fovEffectScale__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraType()Lnet/minecraft/client/CameraType;", cancellable = true)
    private void getCameraType__975457531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975457531L))
            info.setReturnValue(net.minecraft.client.CameraType.THIRD_PERSON_FRONT);
    }

    @Inject(at = @At("HEAD"), method = "getEffectiveRenderDistance()I", cancellable = true)
    private void getEffectiveRenderDistance_1260826678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260826678L))
            info.setReturnValue(1441570348);
    }

    @Inject(at = @At("HEAD"), method = "renderDistance()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void renderDistance__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainHand()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mainHand__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatColors()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatColors__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatDelay()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatDelay__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "autoJump()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void autoJump__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintSpeed()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void glintSpeed__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatScale__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatWidth()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatWidth__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bobView()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void bobView__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLinks()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLinks__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleUse()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleUse__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "graphicsPreset()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void graphicsPreset__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preferredGraphicsBackend()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void preferredGraphicsBackend__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vignette()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void vignette__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fov()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void fov__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudRange()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cloudRange__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narrator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void narrator__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void guiScale__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narratorHotkey()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void narratorHotkey__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "framerateLimit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void framerateLimit__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prioritizeChunkUpdates()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void prioritizeChunkUpdates__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeBlendRadius()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void biomeBlendRadius__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientOcclusion()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void ambientOcclusion__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFinalSoundSourceVolume(Lnet/minecraft/sounds/SoundSource;)F", cancellable = true)
    private void getFinalSoundSourceVolume__811596225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811596225L))
            info.setReturnValue(2.982235E8F);
    }

    @Inject(at = @At("HEAD"), method = "entityDistanceScaling()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void entityDistanceScaling__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureFiltering()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void textureFiltering__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAnisotropyBit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void maxAnisotropyBit__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mipmapLevels()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mipmapLevels__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityShadows()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void entityShadows__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudStatus()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void cloudStatus__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericValueOrOffLabel(Lnet/minecraft/network/chat/Component;I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void genericValueOrOffLabel__1747067626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747067626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSourceVolume(Lnet/minecraft/sounds/SoundSource;)F", cancellable = true)
    private void getSoundSourceVolume__811596225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811596225L))
            info.setReturnValue(2.982235E8F);
    }

    @Inject(at = @At("HEAD"), method = "setCameraType(Lnet/minecraft/client/CameraType;)V", cancellable = true)
    private void setCameraType__1360123765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1360123765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpOptionsForReport()Ljava/lang/String;", cancellable = true)
    private void dumpOptionsForReport_87103961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87103961L))
            info.setReturnValue("*<7\u4338(si$\uCB4CzDO9k\u2721%\u0337paM\uB5F5p!25!");
    }

    @Inject(at = @At("HEAD"), method = "telemetryOptInExtra()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void telemetryOptInExtra__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discreteMouseScroll()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void discreteMouseScroll__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseWheelSensitivity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void mouseWheelSensitivity__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sensitivity()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sensitivity__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invertMouseX()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void invertMouseX__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invertMouseY()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void invertMouseY__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLineSpacing()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLineSpacing__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "panoramaSpeed()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void panoramaSpeed__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrastBlockOutline()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void highContrastBlockOutline__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatHeightFocused()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatHeightFocused__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notificationDisplayTime()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void notificationDisplayTime__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatHeightUnfocused()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatHeightUnfocused__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useNativeTransport()Z", cancellable = true)
    private void useNativeTransport_1260843015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260843015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "inactivityFpsLimit()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void inactivityFpsLimit__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackIndicator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void attackIndicator__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLinksPrompt()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chatLinksPrompt__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "japaneseGlyphVariants()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void japaneseGlyphVariants__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkSectionFadeInTime()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void chunkSectionFadeInTime__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrast()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void highContrast__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateWithMinecart()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void rotateWithMinecart__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "autoSuggestions()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void autoSuggestions__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "operatorItemsTab()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void operatorItemsTab__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideLightningFlash()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideLightningFlash__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideSplashTexts()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideSplashTexts__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "realmsNotifications()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void realmsNotifications__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowServerListing()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void allowServerListing__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showAutosaveIndicator()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void showAutosaveIndicator__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directionalAudio()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void directionalAudio__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprintWindow()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sprintWindow__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSoundDeviceDefault(Ljava/lang/String;)Z", cancellable = true)
    private static void isSoundDeviceDefault__1920037623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920037623L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "inGameNotification()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void inGameNotification__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleAttack()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleAttack__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyShowSecureChat()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void onlyShowSecureChat__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAnisotropyValue()I", cancellable = true)
    private void maxAnisotropyValue_1260826678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260826678L))
            info.setReturnValue(1441570348);
    }

    @Inject(at = @At("HEAD"), method = "screenEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void screenEffectScale__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darknessEffectScale()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void darknessEffectScale__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageTiltStrength()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void damageTiltStrength__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideMatchedNames()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void hideMatchedNames__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundForChatOnly()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void backgroundForChatOnly__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateResourcePacks(Lnet/minecraft/server/packs/repository/PackRepository;)V", cancellable = true)
    private void updateResourcePacks_445726295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(445726295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleSprint()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleSprint__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundDevice()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void soundDevice__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "musicFrequency()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void musicFrequency__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "glintStrength()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void glintStrength__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showSubtitles()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void showSubtitles__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sharePresence()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void sharePresence__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleCrouch()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void toggleCrouch__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveChatDrafts()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void saveChatDrafts__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMenuBackgroundBlurriness()I", cancellable = true)
    private void getMenuBackgroundBlurriness_1260826678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260826678L))
            info.setReturnValue(1441570348);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSourceOptionInstance(Lnet/minecraft/sounds/SoundSource;)Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void getSoundSourceOptionInstance_1574145222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574145222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darkMojangStudiosBackground()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void darkMojangStudiosBackground__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRestartRequiredToApplyVideoSettings()Z", cancellable = true)
    private void isRestartRequiredToApplyVideoSettings_1260843015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260843015L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onboardingAccessibilityFinished()V", cancellable = true)
    private void onboardingAccessibilityFinished_1260839171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1260839171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rawMouseInput()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void rawMouseInput__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadSelectedResourcePacks(Lnet/minecraft/server/packs/repository/PackRepository;)V", cancellable = true)
    private void loadSelectedResourcePacks_445726295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(445726295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exclusiveFullscreen()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void exclusiveFullscreen__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowCursorChanges()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void allowCursorChanges__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyGraphicsPreset(Lnet/minecraft/client/GraphicsPreset;)V", cancellable = true)
    private void applyGraphicsPreset__2113872864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2113872864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableVsync()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void enableVsync__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceUnicodeFont()Lnet/minecraft/client/OptionInstance;", cancellable = true)
    private void forceUnicodeFont__1978816134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978816134L))
            info.setReturnValue(null);
    }


}
