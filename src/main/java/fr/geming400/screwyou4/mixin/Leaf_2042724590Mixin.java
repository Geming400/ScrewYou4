package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ComponentPath.Leaf.class)
public class Leaf_2042724590Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1134098321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134098321L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1481819182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481819182L))
            info.setReturnValue("@x\u4E0FdVi&u%\uCBA1d");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1694890616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694890616L))
            info.setReturnValue(156335678);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void component__2146419680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146419680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leafComponent()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void leafComponent__1306220002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306220002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFocus(Z)V", cancellable = true)
    private void applyFocus__725377484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-725377484L))
            info.cancel();
    }


}
