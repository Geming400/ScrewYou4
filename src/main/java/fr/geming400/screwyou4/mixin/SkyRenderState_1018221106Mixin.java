package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.SkyRenderState.class)
public class SkyRenderState_1018221106Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1056495844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056495844L))
            info.cancel();
    }


}
