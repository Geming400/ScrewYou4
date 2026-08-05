package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ComponentRenderUtils.class)
public class ComponentRenderUtils2036262776Mixin {
        @Inject(at = @At("HEAD"), method = "wrapComponents(Lnet/minecraft/network/chat/FormattedText;ILnet/minecraft/client/gui/Font;)Ljava/util/List;", cancellable = true)
    private static void wrapComponents_2019919853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019919853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clipText(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;I)Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private static void clipText_1279971832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279971832L))
            info.setReturnValue(null);
    }


}
