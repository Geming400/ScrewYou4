package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LevelRenderer.class)
public class LevelRenderer_1611520135Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1649794873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649794873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_615640665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(615640665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cloudRenderer()Lnet/minecraft/client/renderer/CloudRenderer;", cancellable = true)
    private void cloudRenderer_1715654670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715654670L))
            info.setReturnValue(new net.minecraft.client.renderer.CloudRenderer());
    }

    @Inject(at = @At("HEAD"), method = "skyRenderer()Lnet/minecraft/client/renderer/SkyRenderer;", cancellable = true)
    private void skyRenderer_2071012194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071012194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityOutlineTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void entityOutlineTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldBorderRenderer()Lnet/minecraft/client/renderer/WorldBorderRenderer;", cancellable = true)
    private void worldBorderRenderer_1900038917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900038917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionOcclusionGraph()Lnet/minecraft/client/renderer/SectionOcclusionGraph;", cancellable = true)
    private void sectionOcclusionGraph__1841670560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841670560L))
            info.setReturnValue(new net.minecraft.client.renderer.SectionOcclusionGraph());
    }

    @Inject(at = @At("HEAD"), method = "nearbyVisibleSections()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void nearbyVisibleSections__719157790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719157790L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "visibleSections()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void visibleSections__719157790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719157790L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "weatherEffectRenderer()Lnet/minecraft/client/renderer/WeatherEffectRenderer;", cancellable = true)
    private void weatherEffectRenderer_2115328670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115328670L))
            info.setReturnValue(new net.minecraft.client.renderer.WeatherEffectRenderer());
    }

    @Inject(at = @At("HEAD"), method = "translucentTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void translucentTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemEntityTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void itemEntityTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareChunkRenders(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;", cancellable = true)
    private void prepareChunkRenders__407380005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407380005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weatherTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void weatherTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearVisibleSections()V", cancellable = true)
    private void clearVisibleSections_1649794873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649794873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "expectedChunks()Lit/unimi/dsi/fastutil/longs/LongCollection;", cancellable = true)
    private void expectedChunks__2026672179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026672179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetLevelRenderData()V", cancellable = true)
    private void resetLevelRenderData_1649794873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649794873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addMainThreadGizmos(Ljava/util/List;)V", cancellable = true)
    private void addMainThreadGizmos_832301546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832301546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invalidateCompiledGeometry(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/client/Options;Lnet/minecraft/client/Camera;Lnet/minecraft/client/color/block/BlockColors;)V", cancellable = true)
    private void invalidateCompiledGeometry_265550319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(265550319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "particlesTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void particlesTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1649794873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649794873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityRenderDispatcher()Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;", cancellable = true)
    private void entityRenderDispatcher_784658650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784658650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "render(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V", cancellable = true)
    private void render_1056529092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056529092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionRenderDispatcher()Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher;", cancellable = true)
    private void sectionRenderDispatcher_687534822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687534822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cloudsTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void cloudsTarget_1578074187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578074187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRenderedAllSections()Z", cancellable = true)
    private void hasRenderedAllSections_1649798717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649798717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "doEntityOutline()V", cancellable = true)
    private void doEntityOutline_1649794873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649794873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockEntityRenderDispatcher()Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;", cancellable = true)
    private void blockEntityRenderDispatcher_1064117944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064117944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectPerFrameRenderThreadGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerFrameRenderThreadGizmos__1064141244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064141244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "viewArea()Lnet/minecraft/client/renderer/ViewArea;", cancellable = true)
    private void viewArea_1009202534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009202534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSectionCompiledAndVisible(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isSectionCompiledAndVisible_1780290577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780290577L))
            info.setReturnValue(false);
    }


}
