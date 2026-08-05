package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.DisplayMode.class)
public class DisplayMode1515897328Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/ChatComponent$DisplayMode;", cancellable = true)
    private static void values_1888395682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888395682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/ChatComponent$DisplayMode;", cancellable = true)
    private static void valueOf_1454303109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454303109L))
            info.setReturnValue(net.minecraft.client.gui.components.ChatComponent.DisplayMode.BACKGROUND);
    }


}
