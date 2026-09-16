package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.ViewArea.class)
public class ViewArea_385014504Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_828746092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828746092L))
            info.setReturnValue(-662730479);
    }

    @Inject(at = @At("HEAD"), method = "getCameraSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void getCameraSectionPos__1039915242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039915242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "repositionCamera(Lnet/minecraft/core/SectionPos;)Z", cancellable = true)
    private void repositionCamera_1976697067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976697067L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_679878886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679878886L))
            info.setReturnValue(300345263);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY__92599688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92599688L))
            info.setReturnValue(-499554342);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__1711733091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711733091L))
            info.setReturnValue(-805313188);
    }

    @Inject(at = @At("HEAD"), method = "sectionCount()I", cancellable = true)
    private void sectionCount__1004113437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004113437L))
            info.setReturnValue(439141128);
    }

    @Inject(at = @At("HEAD"), method = "minSectionY()I", cancellable = true)
    private void minSectionY__580133369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580133369L))
            info.setReturnValue(1256941230);
    }

    @Inject(at = @At("HEAD"), method = "maxSectionY()I", cancellable = true)
    private void maxSectionY__516264907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516264907L))
            info.setReturnValue(2097562487);
    }

    @Inject(at = @At("HEAD"), method = "releaseAllBuffers()V", cancellable = true)
    private void releaseAllBuffers_79927937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79927937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderSectionAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;", cancellable = true)
    private void getRenderSectionAt_1089932316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089932316L))
            info.setReturnValue(null);
    }


}
