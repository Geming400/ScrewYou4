package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.StringWidget.class)
public class StringWidget_224962577Mixin {
        @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage__1676216361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1676216361L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(ILnet/minecraft/client/gui/components/StringWidget$TextOverflow;)Lnet/minecraft/client/gui/components/StringWidget;", cancellable = true)
    private void setMaxWidth__1739474081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739474081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/StringWidget;", cancellable = true)
    private void setMaxWidth__950544581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950544581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_263224822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263224822L))
            info.setReturnValue(-1121655073);
    }

    @Inject(at = @At("HEAD"), method = "visitLines(Lnet/minecraft/client/gui/ActiveTextCollector;)V", cancellable = true)
    private void visitLines_1195065948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1195065948L))
            info.cancel();
    }


}
