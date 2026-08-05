package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.FaceInfo.VertexInfo.class)
public class VertexInfo906161109Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2465159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2465159L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1676584634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676584634L))
            info.setReturnValue("\uB03DgtFb&QX5NS,qX/w`f)f\u2841YjS!%pv\"dk!vM1\u7E9BXU?&0rTf;`p7\"|C\u969Fg\uCEE2%jq0K\u75682F^50q\u7432=JH,p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1463513200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1463513200L))
            info.setReturnValue(51265964);
    }

    @Inject(at = @At("HEAD"), method = "select(Lorg/joml/Vector3fc;Lorg/joml/Vector3fc;)Lorg/joml/Vector3f;", cancellable = true)
    private void select_1062039211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062039211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void xFace_1498315101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498315101L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.Extent.MAX_Z);
    }

    @Inject(at = @At("HEAD"), method = "zFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void zFace_1538989851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538989851L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.Extent.MAX_Y);
    }

    @Inject(at = @At("HEAD"), method = "yFace()Lnet/minecraft/client/renderer/FaceInfo$Extent;", cancellable = true)
    private void yFace_1518652476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518652476L))
            info.setReturnValue(net.minecraft.client.renderer.FaceInfo.Extent.MIN_Y);
    }


}
