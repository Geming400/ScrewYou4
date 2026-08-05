package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.LevelRenderState.class)
public class LevelRenderState_1220322293Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__509114696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-509114696L))
            info.cancel();
    }


}
