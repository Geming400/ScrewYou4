package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.SectionTaskDynamicQueue.class)
public class SectionTaskDynamicQueue_1993925458Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1857310250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857310250L))
            info.setReturnValue(1390090202);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1208098743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1208098743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask;)V", cancellable = true)
    private void add_378424103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(378424103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "poll(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection$SectionTask;", cancellable = true)
    private void poll__1379523637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379523637L))
            info.setReturnValue(null);
    }


}
