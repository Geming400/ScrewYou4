package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.WeatherRenderState.class)
public class WeatherRenderState_1167140517Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1205415255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1205415255L))
            info.cancel();
    }


}
