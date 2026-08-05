package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.StringWidget.TextOverflow.class)
public class TextOverflow_1801961688Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/StringWidget$TextOverflow;", cancellable = true)
    private static void values__1894921647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1894921647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/StringWidget$TextOverflow;", cancellable = true)
    private static void valueOf_1965953076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965953076L))
            info.setReturnValue(net.minecraft.client.gui.components.StringWidget.TextOverflow.CLAMPED);
    }


}
