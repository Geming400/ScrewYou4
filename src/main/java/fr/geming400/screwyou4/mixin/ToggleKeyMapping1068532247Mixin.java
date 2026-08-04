package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ToggleKeyMapping.class)
public class ToggleKeyMapping1068532247Mixin {
        @Inject(at = @At("HEAD"), method = "shouldRestoreStateOnScreenClosed()Z", cancellable = true)
    private void shouldRestoreStateOnScreenClosed_1106810830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106810830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDown(Z)V", cancellable = true)
    private void setDown__1996818220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1996818220L))
            info.cancel();
    }


}
