package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.class)
public class DrawableGizmoPrimitives1073621370Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submit__900381111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-900381111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPoint(Lnet/minecraft/world/phys/Vec3;IF)V", cancellable = true)
    private void addPoint__1748143611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1748143611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTriangleFan([Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void addTriangleFan__1875630929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1875630929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLine(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)V", cancellable = true)
    private void addLine__1611942859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1611942859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addQuad(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void addQuad_117548846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117548846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addText(Lnet/minecraft/world/phys/Vec3;Ljava/lang/String;Lnet/minecraft/gizmos/TextGizmo$Style;)V", cancellable = true)
    private void addText__72199992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-72199992L))
            info.cancel();
    }


}
