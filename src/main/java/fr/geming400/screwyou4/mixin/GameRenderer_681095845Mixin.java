package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.GameRenderer.class)
public class GameRenderer_681095845Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void update_1633359902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633359902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/DeltaTracker;Z)V", cancellable = true)
    private void extract_179610490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179610490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize__314783625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-314783625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_1644498962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1644498962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lnet/minecraft/client/DeltaTracker;Z)V", cancellable = true)
    private void render_179610490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179610490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levelLightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void levelLightmap__1719518766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719518766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainRenderTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void mainRenderTarget_647649897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647649897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRenderState()Lnet/minecraft/client/renderer/state/GameRenderState;", cancellable = true)
    private void gameRenderState__2114733927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114733927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerPanoramaTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerPanoramaTextures__1086124668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1086124668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preloadUiShader(Lnet/minecraft/server/packs/resources/ResourceProvider;)V", cancellable = true)
    private void preloadUiShader_1014912568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1014912568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkEntityPostEffect(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void checkEntityPostEffect_229371184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(229371184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "togglePostEffect()V", cancellable = true)
    private void togglePostEffect_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearPostEffect()V", cancellable = true)
    private void clearPostEffect_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "currentPostEffect()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void currentPostEffect__1761970709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761970709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderLevel(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void renderLevel_1633359902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633359902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRenderBlockOutline(Z)V", cancellable = true)
    private void setRenderBlockOutline_1910712673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1910712673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overlayTexture()Lnet/minecraft/client/renderer/texture/OverlayTexture;", cancellable = true)
    private void overlayTexture_921217879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921217879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "panorama()Lnet/minecraft/client/renderer/Panorama;", cancellable = true)
    private void panorama__538409215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538409215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureRenderDispatcher()Lnet/minecraft/client/renderer/feature/FeatureRenderDispatcher;", cancellable = true)
    private void featureRenderDispatcher_1051730282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051730282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "processBlurEffect()V", cancellable = true)
    private void processBlurEffect_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mainCamera()Lnet/minecraft/client/Camera;", cancellable = true)
    private void mainCamera__1082056717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082056717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetData()V", cancellable = true)
    private void resetData_719370583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(719370583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lightmap()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void lightmap__1719518766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719518766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lighting()Lcom/mojang/blaze3d/platform/Lighting;", cancellable = true)
    private void lighting__930018859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930018859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderBuffers()Lnet/minecraft/client/renderer/RenderBuffers;", cancellable = true)
    private void renderBuffers_1947620455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947620455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bossOverlayWorldDarkening(F)F", cancellable = true)
    private void bossOverlayWorldDarkening_1892226877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892226877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectPointToScreen(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void projectPointToScreen__1924216407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924216407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nightVisionScale(Lnet/minecraft/world/entity/LivingEntity;F)F", cancellable = true)
    private static void nightVisionScale_2087338885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087338885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectHorizonToScreen()D", cancellable = true)
    private void projectHorizonToScreen_719353285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719353285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayItemActivation(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void displayItemActivation__1879340164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1879340164L))
            info.cancel();
    }


}
