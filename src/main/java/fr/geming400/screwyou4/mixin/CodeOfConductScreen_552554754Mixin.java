package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.CodeOfConductScreen.class)
public class CodeOfConductScreen_552554754Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_422871095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(422871095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc__36541625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36541625L))
            info.setReturnValue(false);
    }


}
