package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.GameRenderer.class)
public class GameRenderer_681095845Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void update__1568336921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1568336921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/DeltaTracker;Z)V", cancellable = true)
    private void extract__1402401767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1402401767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1433479585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433479585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__436520637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436520637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_551412186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551412186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_1189740688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189740688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "displayItemActivation(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void displayItemActivation_858991089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(858991089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "panorama()Lnet/minecraft/client/renderer/Panorama;", cancellable = true)
    private void panorama__129560074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129560074L))
            info.setReturnValue(new net.minecraft.client.renderer.Panorama());
    }

    @Inject(at = @At("HEAD"), method = "mainCamera()Lnet/minecraft/client/Camera;", cancellable = true)
    private void mainCamera__221734539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221734539L))
            info.setReturnValue(new net.minecraft.client.Camera());
    }

    @Inject(at = @At("HEAD"), method = "resetData()V", cancellable = true)
    private void resetData_436047710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(436047710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bossOverlayWorldDarkening(F)F", cancellable = true)
    private void bossOverlayWorldDarkening__2113490767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113490767L))
            info.setReturnValue(7.022309E8F);
    }

    @Inject(at = @At("HEAD"), method = "renderBuffers()Lnet/minecraft/client/renderer/RenderBuffers;", cancellable = true)
    private void renderBuffers_334046282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334046282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectHorizonToScreen()D", cancellable = true)
    private void projectHorizonToScreen_599013948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599013948L))
            info.setReturnValue(7.022309003075112E8D);
    }

    @Inject(at = @At("HEAD"), method = "projectPointToScreen(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void projectPointToScreen_1145187335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145187335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nightVisionScale(Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private static void nightVisionScale_1690108731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690108731L))
            info.setReturnValue(7.022309E8F);
    }

    @Inject(at = @At("HEAD"), method = "lightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void lightmap__691460520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691460520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearPostEffect()V", cancellable = true)
    private void clearPostEffect_2035006361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2035006361L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "togglePostEffect()V", cancellable = true)
    private void togglePostEffect__1847253070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1847253070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkEntityPostEffect(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void checkEntityPostEffect__1084530452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1084530452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "currentPostEffect()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void currentPostEffect__1993596779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993596779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRenderBlockOutline(Z)V", cancellable = true)
    private void setRenderBlockOutline_602263374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(602263374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderLevel(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void renderLevel__677713492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-677713492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/DeltaTracker;Z)V", cancellable = true)
    private void render__627858780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-627858780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levelLightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void levelLightmap__521664004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521664004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lighting()Lcom/mojang/blaze3d/platform/Lighting;", cancellable = true)
    private void lighting__88162847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88162847L))
            info.setReturnValue(new com.mojang.blaze3d.platform.Lighting());
    }

    @Inject(at = @At("HEAD"), method = "featureRenderDispatcher()Lnet/minecraft/client/renderer/feature/FeatureRenderDispatcher;", cancellable = true)
    private void featureRenderDispatcher__2040756073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040756073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processBlurEffect()V", cancellable = true)
    private void processBlurEffect_1544577296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1544577296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overlayTexture()Lnet/minecraft/client/renderer/texture/OverlayTexture;", cancellable = true)
    private void overlayTexture__112288190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112288190L))
            info.setReturnValue(new net.minecraft.client.renderer.texture.OverlayTexture());
    }

    @Inject(at = @At("HEAD"), method = "registerPanoramaTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerPanoramaTextures__1595686284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1595686284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gameRenderState()Lnet/minecraft/client/renderer/state/GameRenderState;", cancellable = true)
    private void gameRenderState__1893367952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893367952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainRenderTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void mainRenderTarget_2097743241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097743241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preloadUiShader(Lnet/minecraft/server/packs/resources/ResourceProvider;)V", cancellable = true)
    private void preloadUiShader_284287994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(284287994L))
            info.cancel();
    }


}
