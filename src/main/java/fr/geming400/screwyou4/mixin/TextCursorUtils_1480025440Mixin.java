package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.TextCursorUtils.class)
public class TextCursorUtils_1480025440Mixin {
        @Inject(at = @At("HEAD"), method = "isCursorVisible(J)Z", cancellable = true)
    private static void isCursorVisible_522864058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522864058L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractAppendCursor(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/gui/Font;IIIZ)V", cancellable = true)
    private static void extractAppendCursor_1895608729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1895608729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractInsertCursor(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIII)V", cancellable = true)
    private static void extractInsertCursor__215813233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-215813233L))
            info.cancel();
    }


}
