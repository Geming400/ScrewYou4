package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.gizmos.DrawableGizmoPrimitives.class)
public class DrawableGizmoPrimitives1073621370Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;Z)V", cancellable = true)
    private void submit_1044236337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1044236337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPoint(Lnet/minecraft/world/phys/Vec3;IF)V", cancellable = true)
    private void addPoint__1140337706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1140337706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLine(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IF)V", cancellable = true)
    private void addLine_2071959370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2071959370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addQuad(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void addQuad__115829850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-115829850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTriangleFan([Lnet/minecraft/world/phys/Vec3;I)V", cancellable = true)
    private void addTriangleFan_141770661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(141770661L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addText(Lnet/minecraft/world/phys/Vec3;Ljava/lang/String;Lnet/minecraft/gizmos/TextGizmo$Style;)V", cancellable = true)
    private void addText__485615526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-485615526L))
            info.cancel();
    }


}
