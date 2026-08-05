package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.CompiledSectionMesh.class)
public class CompiledSectionMesh1719274451Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isEmpty_1096458694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096458694L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1757549190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757549190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSectionDraw(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lnet/minecraft/client/renderer/chunk/SectionMesh$SectionDraw;", cancellable = true)
    private void getSectionDraw__1886286918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886286918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucentGeometry()Z", cancellable = true)
    private void hasTranslucentGeometry_1757553034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757553034L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDifferentPointOfView(Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;)Z", cancellable = true)
    private void isDifferentPointOfView_1461795364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461795364L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "facesCanSeeEachother(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void facesCanSeeEachother__1829074782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829074782L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBlockEntities()Ljava/util/List;", cancellable = true)
    private void getRenderableBlockEntities__949356029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949356029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVertexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)V", cancellable = true)
    private void setVertexBufferUploaded_1096454850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096454850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isIndexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isIndexBufferUploaded_1096458694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096458694L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasRenderableLayers()Z", cancellable = true)
    private void hasRenderableLayers_1757553034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757553034L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isVertexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isVertexBufferUploaded_1096458694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096458694L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTranslucencyPointOfView(Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;)V", cancellable = true)
    private void setTranslucencyPointOfView_1461791520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461791520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTransparencyState()Lcom/mojang/blaze3d/vertex/MeshData$SortState;", cancellable = true)
    private void getTransparencyState_1748836603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748836603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIndexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)V", cancellable = true)
    private void setIndexBufferUploaded_1096454850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096454850L))
            info.cancel();
    }


}
