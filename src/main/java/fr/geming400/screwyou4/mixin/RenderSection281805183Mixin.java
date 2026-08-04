package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection.class)
public class RenderSection281805183Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_320079922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(320079922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSectionNode()J", cancellable = true)
    private void getSectionNode_320068390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320068390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSectionNode(J)V", cancellable = true)
    private void setSectionNode_1496645676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1496645676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transparencyResortingScheduled()Z", cancellable = true)
    private void transparencyResortingScheduled_320083766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320083766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighborSectionNode(Lnet/minecraft/core/Direction;)J", cancellable = true)
    private void getNeighborSectionNode__838132430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838132430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucentGeometry()Z", cancellable = true)
    private void hasTranslucentGeometry_320083766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320083766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resortTransparency()V", cancellable = true)
    private void resortTransparency_320079922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(320079922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSectionMesh()Lnet/minecraft/client/renderer/chunk/SectionMesh;", cancellable = true)
    private void getSectionMesh__2029267249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029267249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRenderOrigin__1611581696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611581696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasPreviouslyEmpty()Z", cancellable = true)
    private void wasPreviouslyEmpty_320083766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320083766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFadeDuration(J)V", cancellable = true)
    private void setFadeDuration_1496645676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1496645676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWasPreviouslyEmpty(Z)V", cancellable = true)
    private void setWasPreviouslyEmpty_1511422012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511422012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compileSync(Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;)V", cancellable = true)
    private void compileSync_653664868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(653664868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compileAsync(Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;)V", cancellable = true)
    private void compileAsync_653664868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(653664868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVisibility(J)F", cancellable = true)
    private void getVisibility_1496630300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496630300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundingBox__1138852169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138852169L))
            info.setReturnValue(null);
    }


}
