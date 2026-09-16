package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiSkinRenderState.class)
public class GuiSkinRenderState_1566216889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_657590620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657590620L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1958326883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1958326883L))
            info.setReturnValue("TAbv8]2.^(>Ld^|\u2C620\u70EFqRdp4\u39D0g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2123568979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123568979L))
            info.setReturnValue(-896889933);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__857501103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857501103L))
            info.setReturnValue(4.460445E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__900715461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900715461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_2133566853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133566853L))
            info.setReturnValue(1886571534);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1__1273896762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273896762L))
            info.setReturnValue(1119251121);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_2104937702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104937702L))
            info.setReturnValue(-2051799468);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0__1302525913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302525913L))
            info.setReturnValue(1039930724);
    }

    @Inject(at = @At("HEAD"), method = "rotationX()F", cancellable = true)
    private void rotationX_594529537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594529537L))
            info.setReturnValue(4.460445E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotationY()F", cancellable = true)
    private void rotationY_623158688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623158688L))
            info.setReturnValue(4.460445E8F);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__958683417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958683417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerModel()Lnet/minecraft/client/model/Model$Simple;", cancellable = true)
    private void playerModel_241400657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241400657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__1897548774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897548774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pivotY()F", cancellable = true)
    private void pivotY__1473265820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473265820L))
            info.setReturnValue(4.460445E8F);
    }


}
