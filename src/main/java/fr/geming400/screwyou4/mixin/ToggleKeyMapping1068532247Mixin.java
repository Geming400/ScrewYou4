package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ToggleKeyMapping.class)
public class ToggleKeyMapping1068532247Mixin {
        @Inject(at = @At("HEAD"), method = "setDown(Z)V", cancellable = true)
    private void setDown_1616224760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616224760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRestoreStateOnScreenClosed()Z", cancellable = true)
    private void shouldRestoreStateOnScreenClosed_1520220641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520220641L))
            info.setReturnValue(false);
    }


}
