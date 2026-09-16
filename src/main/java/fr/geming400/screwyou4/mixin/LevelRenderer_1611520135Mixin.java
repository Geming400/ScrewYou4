package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LevelRenderer.class)
public class LevelRenderer_1611520135Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__503055295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-503055295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_493903653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(493903653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1425236263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1425236263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMainThreadGizmos(Ljava/util/List;)V", cancellable = true)
    private void addMainThreadGizmos__1668259827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1668259827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "particlesTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void particlesTarget__1378163095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378163095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weatherTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void weatherTarget__1710459344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710459344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expectedChunks()Lit/unimi/dsi/fastutil/longs/LongCollection;", cancellable = true)
    private void expectedChunks__972574645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-972574645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionRenderDispatcher()Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher;", cancellable = true)
    private void sectionRenderDispatcher_817148228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817148228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudsTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void cloudsTarget__547068390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547068390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRenderedAllSections()Z", cancellable = true)
    private void hasRenderedAllSections__175315907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175315907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doEntityOutline()V", cancellable = true)
    private void doEntityOutline__2124281947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2124281947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityOutlineTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void entityOutlineTarget__284797541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284797541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visibleSections()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void visibleSections__982766302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982766302L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "sectionOcclusionGraph()Lnet/minecraft/client/renderer/SectionOcclusionGraph;", cancellable = true)
    private void sectionOcclusionGraph_486567706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486567706L))
            info.setReturnValue(new net.minecraft.client.renderer.SectionOcclusionGraph());
    }

    @Inject(at = @At("HEAD"), method = "worldBorderRenderer()Lnet/minecraft/client/renderer/WorldBorderRenderer;", cancellable = true)
    private void worldBorderRenderer_570312868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570312868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearbyVisibleSections()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void nearbyVisibleSections__541640703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541640703L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "weatherEffectRenderer()Lnet/minecraft/client/renderer/WeatherEffectRenderer;", cancellable = true)
    private void weatherEffectRenderer__164094698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164094698L))
            info.setReturnValue(new net.minecraft.client.renderer.WeatherEffectRenderer());
    }

    @Inject(at = @At("HEAD"), method = "skyRenderer()Lnet/minecraft/client/renderer/SkyRenderer;", cancellable = true)
    private void skyRenderer_69523934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69523934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translucentTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void translucentTarget_857654549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857654549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemEntityTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void itemEntityTarget_1976001042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976001042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareChunkRenders(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;", cancellable = true)
    private void prepareChunkRenders_629369188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629369188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetLevelRenderData()V", cancellable = true)
    private void resetLevelRenderData__1902040924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1902040924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidateCompiledGeometry(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Options;Lnet/minecraft/client/Camera;Lnet/minecraft/client/color/block/BlockColors;)V", cancellable = true)
    private void invalidateCompiledGeometry__2128746387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2128746387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearVisibleSections()V", cancellable = true)
    private void clearVisibleSections__1769211802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1769211802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V", cancellable = true)
    private void render__1143486374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1143486374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectPerFrameRenderThreadGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerFrameRenderThreadGizmos_1195543889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195543889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "viewArea()Lnet/minecraft/client/renderer/ViewArea;", cancellable = true)
    private void viewArea__220240072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220240072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSectionCompiledAndVisible(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isSectionCompiledAndVisible__1363949032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363949032L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void blockEntityRenderDispatcher_815238347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815238347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void entityRenderDispatcher_1284249082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284249082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudRenderer()Lnet/minecraft/client/renderer/CloudRenderer;", cancellable = true)
    private void cloudRenderer__1908431626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908431626L))
            info.setReturnValue(new net.minecraft.client.renderer.CloudRenderer());
    }


}
