package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.VertexInfo.class)
public class VertexInfo906161109Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2003293928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003293928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__229298866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229298866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_944423851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944423851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;)Lorg/joml/Vector3f;", cancellable = true)
    private void select_820204327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820204327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void xFace__499791246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499791246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void zFace__499791246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499791246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void yFace__499791246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499791246L))
            info.setReturnValue(null);
    }


}
