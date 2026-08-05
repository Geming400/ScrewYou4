package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.FocusNavigationEvent.InitialFocus.class)
public class InitialFocus_200552988Mixin {
        @Inject(at = @At("HEAD"), method = "getVerticalDirectionForInitialFocus()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getVerticalDirectionForInitialFocus_2062818553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062818553L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.RIGHT);
    }


}
