package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CycleButton.DisplayState.class)
public class DisplayState_482557619Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/CycleButton$DisplayState;", cancellable = true)
    private static void values__1847369281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847369281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/CycleButton$DisplayState;", cancellable = true)
    private static void valueOf_522988294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522988294L))
            info.setReturnValue(net.minecraft.client.gui.components.CycleButton.DisplayState.VALUE);
    }


}
