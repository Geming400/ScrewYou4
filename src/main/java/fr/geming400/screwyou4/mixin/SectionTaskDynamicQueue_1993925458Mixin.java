package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionTaskDynamicQueue.class)
public class SectionTaskDynamicQueue_1993925458Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_2032187703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032187703L))
            info.setReturnValue(-83504405);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_2032201188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032201188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask;)V", cancellable = true)
    private void add__169105914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-169105914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "poll(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask;", cancellable = true)
    private void poll_725614796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725614796L))
            info.setReturnValue(null);
    }


}
