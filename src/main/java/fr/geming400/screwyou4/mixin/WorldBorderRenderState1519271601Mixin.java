package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.WorldBorderRenderState.class)
public class WorldBorderRenderState1519271601Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__210165387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-210165387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "closestBorder(DD)Ljava/util/List;", cancellable = true)
    private void closestBorder__567894906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567894906L))
            info.setReturnValue(null);
    }


}
