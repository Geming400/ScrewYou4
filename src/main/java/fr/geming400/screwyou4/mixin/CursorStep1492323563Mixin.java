package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.TextFieldHelper.CursorStep.class)
public class CursorStep1492323563Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;", cancellable = true)
    private static void values_785406403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785406403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;", cancellable = true)
    private static void valueOf_1744744960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744744960L))
            info.setReturnValue(null);
    }


}
