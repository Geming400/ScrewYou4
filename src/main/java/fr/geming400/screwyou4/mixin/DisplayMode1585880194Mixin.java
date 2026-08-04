package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.Font.DisplayMode.class)
public class DisplayMode1585880194Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private static void values__1722702447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722702447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/Font$DisplayMode;", cancellable = true)
    private static void valueOf_143096564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143096564L))
            info.setReturnValue(null);
    }


}
