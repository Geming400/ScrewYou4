package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection.class)
public class RenderSection281805183Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1447631805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1447631805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getBoundingBox_61219014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61219014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSectionNode()J", cancellable = true)
    private void getSectionNode_729913461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729913461L))
            info.setReturnValue(561521720614093783L);
    }

    @Inject(at = @At("HEAD"), method = "setSectionNode(J)V", cancellable = true)
    private void setSectionNode_706017585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(706017585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVisibility(J)F", cancellable = true)
    private void getVisibility_358447396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358447396L))
            info.setReturnValue(3.333053E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOrigin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRenderOrigin_78541422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78541422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSectionMesh()Lnet/minecraft/client/renderer/chunk/SectionMesh;", cancellable = true)
    private void getSectionMesh_741494547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741494547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasPreviouslyEmpty()Z", cancellable = true)
    private void wasPreviouslyEmpty__1857329034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857329034L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "compileSync(Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;)V", cancellable = true)
    private void compileSync__1845277358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845277358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWasPreviouslyEmpty(Z)V", cancellable = true)
    private void setWasPreviouslyEmpty__2103268994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2103268994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "compileAsync(Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;)V", cancellable = true)
    private void compileAsync_582740141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(582740141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFadeDuration(J)V", cancellable = true)
    private void setFadeDuration__1774367650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1774367650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resortTransparency()V", cancellable = true)
    private void resortTransparency_253717897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(253717897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasTranslucentGeometry()Z", cancellable = true)
    private void hasTranslucentGeometry_188102629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188102629L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNeighborSectionNode(Lnet/minecraft/core/Direction;)J", cancellable = true)
    private void getNeighborSectionNode__98222125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98222125L))
            info.setReturnValue(-1140392867811646835L);
    }

    @Inject(at = @At("HEAD"), method = "transparencyResortingScheduled()Z", cancellable = true)
    private void transparencyResortingScheduled__206172542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206172542L))
            info.setReturnValue(true);
    }


}
