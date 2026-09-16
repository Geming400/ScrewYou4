package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.StringWidget.class)
public class StringWidget_224962577Mixin {
        @Inject(at = @At("HEAD"), method = "setMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setMessage_1617573234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1617573234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(ILnet/minecraft/client/gui/components/StringWidget$TextOverflow;)Lnet/minecraft/client/gui/components/StringWidget;", cancellable = true)
    private void setMaxWidth__1601538653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601538653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxWidth(I)Lnet/minecraft/client/gui/components/StringWidget;", cancellable = true)
    private void setMaxWidth__1211742857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211742857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1712933914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712933914L))
            info.setReturnValue(417066553);
    }

    @Inject(at = @At("HEAD"), method = "visitLines(Lnet/minecraft/client/gui/ActiveTextCollector;)V", cancellable = true)
    private void visitLines__553874072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-553874072L))
            info.cancel();
    }


}
