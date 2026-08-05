package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ViewArea.class)
public class ViewArea_385014504Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "releaseAllBuffers()V", cancellable = true)
    private void releaseAllBuffers_423289242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(423289242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderSectionAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;", cancellable = true)
    private void getRenderSectionAt__1566444720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566444720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void getCameraSectionPos_1293519104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293519104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "maxSectionY()I", cancellable = true)
    private void maxSectionY_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "minSectionY()I", cancellable = true)
    private void minSectionY_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "sectionCount()I", cancellable = true)
    private void sectionCount_423276749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423276749L))
            info.setReturnValue(139967094);
    }

    @Inject(at = @At("HEAD"), method = "repositionCamera(Lnet/minecraft/core/SectionPos;)Z", cancellable = true)
    private void repositionCamera__703775030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703775030L))
            info.setReturnValue(true);
    }


}
