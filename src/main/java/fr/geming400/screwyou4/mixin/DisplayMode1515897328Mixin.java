package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.DisplayMode.class)
public class DisplayMode1515897328Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/ChatComponent$DisplayMode;", cancellable = true)
    private static void values__1362440764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362440764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/ChatComponent$DisplayMode;", cancellable = true)
    private static void valueOf__895799971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895799971L))
            info.setReturnValue(net.minecraft.client.gui.components.ChatComponent.DisplayMode.FOREGROUND_RESTRICTED);
    }


}
