package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.CompiledSectionMesh.class)
public class CompiledSectionMesh1719274451Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isEmpty__1213737591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213737591L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__395300978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-395300978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIndexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)V", cancellable = true)
    private void setIndexBufferUploaded__769860814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-769860814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTransparencyState()Lcom/mojang/blaze3d/vertex/MeshData$SortState;", cancellable = true)
    private void getTransparencyState__1928312418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1928312418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVertexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)V", cancellable = true)
    private void setVertexBufferUploaded__553130296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-553130296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTranslucencyPointOfView(Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;)V", cancellable = true)
    private void setTranslucencyPointOfView_9650681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(9650681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasRenderableLayers()Z", cancellable = true)
    private void hasRenderableLayers__2141635330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141635330L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVertexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isVertexBufferUploaded_2092005012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092005012L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isIndexBufferUploaded(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Z", cancellable = true)
    private void isIndexBufferUploaded_2086416494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086416494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRenderableBlockEntities()Ljava/util/List;", cancellable = true)
    private void getRenderableBlockEntities_292932395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292932395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSectionDraw(Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;)Lnet/minecraft/client/renderer/chunk/SectionMesh$SectionDraw;", cancellable = true)
    private void getSectionDraw_1378552653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378552653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDifferentPointOfView(Lnet/minecraft/client/renderer/chunk/TranslucencyPointOfView;)Z", cancellable = true)
    private void isDifferentPointOfView_1608384513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608384513L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucentGeometry()Z", cancellable = true)
    private void hasTranslucentGeometry_1625571897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625571897L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "facesCanSeeEachother(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void facesCanSeeEachother_871380332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871380332L))
            info.setReturnValue(false);
    }


}
