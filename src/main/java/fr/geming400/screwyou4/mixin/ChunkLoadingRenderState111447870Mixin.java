package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.ChunkLoadingRenderState.class)
public class ChunkLoadingRenderState111447870Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_149722609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(149722609L))
            info.cancel();
    }


}
