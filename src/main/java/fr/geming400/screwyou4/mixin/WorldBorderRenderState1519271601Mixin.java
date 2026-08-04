package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.WorldBorderRenderState.class)
public class WorldBorderRenderState1519271601Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1557546340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1557546340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "closestBorder(DD)Ljava/util/List;", cancellable = true)
    private void closestBorder_1857551969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857551969L))
            info.setReturnValue(null);
    }


}
