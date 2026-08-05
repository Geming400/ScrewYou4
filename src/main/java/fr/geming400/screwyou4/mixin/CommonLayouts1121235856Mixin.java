package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.CommonLayouts.class)
public class CommonLayouts1121235856Mixin {
        @Inject(at = @At("HEAD"), method = "labeledElement(Lnet/minecraft/client/gui/Font;Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/network/chat/Component;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private static void labeledElement_2143442755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143442755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "labeledElement(Lnet/minecraft/client/gui/Font;Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private static void labeledElement_465943415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465943415L))
            info.setReturnValue(null);
    }


}
