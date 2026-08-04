package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Projection.class)
public class Projection_242761515Mixin {
        @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_281020877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281020877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSize(FF)V", cancellable = true)
    private void setSize__841775971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-841775971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fov()F", cancellable = true)
    private void fov_281020877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281020877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zFar()F", cancellable = true)
    private void zFar_281020877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281020877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zNear()F", cancellable = true)
    private void zNear_281020877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281020877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupOrtho(FFFFZ)V", cancellable = true)
    private void setupOrtho_531273831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(531273831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height_281020877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281020877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "invertY()Z", cancellable = true)
    private void invertY_281040097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281040097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getMatrix_676504287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676504287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupPerspective(FFFFF)V", cancellable = true)
    private void setupPerspective_512803411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(512803411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMatrixVersion()J", cancellable = true)
    private void getMatrixVersion_281024721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281024721L))
            info.setReturnValue(null);
    }


}
