package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Projection.class)
public class Projection_242761515Mixin {
        @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width__1397389369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397389369L))
            info.setReturnValue(6.562451E8F);
    }

    @Inject(at = @At("HEAD"), method = "setSize(FF)V", cancellable = true)
    private void setSize__144798790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-144798790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getMatrix__1405810474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1405810474L))
            info.setReturnValue(new org.joml.Matrix4f());
    }

    @Inject(at = @At("HEAD"), method = "setupOrtho(FFFFZ)V", cancellable = true)
    private void setupOrtho_55683554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(55683554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fov()F", cancellable = true)
    private void fov_765949216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765949216L))
            info.setReturnValue(6.562451E8F);
    }

    @Inject(at = @At("HEAD"), method = "height()F", cancellable = true)
    private void height__842589946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842589946L))
            info.setReturnValue(6.562451E8F);
    }

    @Inject(at = @At("HEAD"), method = "zNear()F", cancellable = true)
    private void zNear_1916101451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916101451L))
            info.setReturnValue(6.562451E8F);
    }

    @Inject(at = @At("HEAD"), method = "zFar()F", cancellable = true)
    private void zFar__290185296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-290185296L))
            info.setReturnValue(6.562451E8F);
    }

    @Inject(at = @At("HEAD"), method = "getMatrixVersion()J", cancellable = true)
    private void getMatrixVersion_268826448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268826448L))
            info.setReturnValue(7808759023460313278L);
    }

    @Inject(at = @At("HEAD"), method = "setupPerspective(FFFFF)V", cancellable = true)
    private void setupPerspective__1019160814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1019160814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "invertY()Z", cancellable = true)
    private void invertY_506727294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506727294L))
            info.setReturnValue(true);
    }


}
