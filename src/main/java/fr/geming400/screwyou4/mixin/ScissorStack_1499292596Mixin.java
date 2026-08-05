package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.ScissorStack.class)
public class ScissorStack_1499292596Mixin {
        @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void peek_288276816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288276816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void push__1466939605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1466939605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_2098954933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2098954933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containsPoint(II)Z", cancellable = true)
    private void containsPoint_1472750777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472750777L))
            info.setReturnValue(true);
    }


}
