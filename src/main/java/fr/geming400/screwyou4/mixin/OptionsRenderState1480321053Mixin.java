package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.OptionsRenderState.class)
public class OptionsRenderState1480321053Mixin {
        @Inject(at = @At("HEAD"), method = "getBackgroundOpacity(F)F", cancellable = true)
    private void getBackgroundOpacity_1858235837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858235837L))
            info.setReturnValue(1.5500201E7F);
    }


}
