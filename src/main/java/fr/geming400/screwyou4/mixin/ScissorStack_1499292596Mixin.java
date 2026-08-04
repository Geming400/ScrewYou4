package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.ScissorStack.class)
public class ScissorStack_1499292596Mixin {
        @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void peek__1620649397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620649397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void push_401443985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(401443985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_1537567334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1537567334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containsPoint(II)Z", cancellable = true)
    private void containsPoint_503416970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503416970L))
            info.setReturnValue(null);
    }


}
