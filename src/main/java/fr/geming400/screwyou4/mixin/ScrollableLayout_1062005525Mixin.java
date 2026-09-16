package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ScrollableLayout.class)
public class ScrollableLayout_1062005525Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1965442839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965442839L))
            info.setReturnValue(2067497954);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1936813688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936813688L))
            info.setReturnValue(-1873951039);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__663611651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663611651L))
            info.setReturnValue(1671228317);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_80880118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(80880118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__875890966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875890966L))
            info.setReturnValue(-1563612270);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_968383799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(968383799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_228824804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(228824804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinWidth(I)V", cancellable = true)
    private void setMinWidth__774143274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-774143274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_1449353563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1449353563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxHeight(I)V", cancellable = true)
    private void setMaxHeight_895949033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(895949033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinHeight(I)V", cancellable = true)
    private void setMinHeight__214489897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-214489897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setScrollbarSpacing(I)V", cancellable = true)
    private void setScrollbarSpacing_76489407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76489407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren__2013026044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013026044L))
            info.cancel();
    }


}
