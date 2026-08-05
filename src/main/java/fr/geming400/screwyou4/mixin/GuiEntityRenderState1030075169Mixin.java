package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiEntityRenderState.class)
public class GuiEntityRenderState1030075169Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1879379868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879379868L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__105384806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105384806L))
            info.setReturnValue("bxg7W_.X[qiH\uC0AF \u4727Q_3;r->_!8\u5D84Z*=,rNu[4;\u9D15 W(#D}1AY iJdsu[!&of_\u0364Aaxu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1068337911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068337911L))
            info.setReturnValue(-1022367);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_1068334532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068334532L))
            info.setReturnValue(8.314583E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__2089866823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089866823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1068337415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068337415L))
            info.setReturnValue(275996841);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1068337415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068337415L))
            info.setReturnValue(275996841);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1068337415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068337415L))
            info.setReturnValue(275996841);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1068337415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068337415L))
            info.setReturnValue(275996841);
    }

    @Inject(at = @At("HEAD"), method = "renderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void renderState_441309765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441309765L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "overrideCameraAngle()Lorg/joml/Quaternionfc;", cancellable = true)
    private void overrideCameraAngle__1035843318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035843318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionfc;", cancellable = true)
    private void rotation__1035843318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035843318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translation()Lorg/joml/Vector3fc;", cancellable = true)
    private void translation_1576019874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576019874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__2089866823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089866823L))
            info.setReturnValue(null);
    }


}
