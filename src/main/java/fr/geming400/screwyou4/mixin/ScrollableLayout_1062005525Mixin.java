package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ScrollableLayout.class)
public class ScrollableLayout_1062005525Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1100267770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100267770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1100267770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100267770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_1100267770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100267770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1100280263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100280263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_1743021937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743021937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxHeight(I)V", cancellable = true)
    private void setMaxHeight__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setScrollbarSpacing(I)V", cancellable = true)
    private void setScrollbarSpacing__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinHeight(I)V", cancellable = true)
    private void setMinHeight__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinWidth(I)V", cancellable = true)
    private void setMinWidth__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_1100280263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100280263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__2019044800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2019044800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1100267770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100267770L))
            info.setReturnValue(null);
    }


}
