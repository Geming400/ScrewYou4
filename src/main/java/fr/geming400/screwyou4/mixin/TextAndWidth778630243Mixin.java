package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineLabel.TextAndWidth.class)
public class TextAndWidth778630243Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__129996025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129996025L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1549053768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549053768L))
            info.setReturnValue("\u6175y\u67BAm\u4CEE(zHot)c6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1335982334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335982334L))
            info.setReturnValue(-1714276892);
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void text_303038916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303038916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__861517757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861517757L))
            info.setReturnValue(-341161331);
    }


}
