package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.OptionsRenderState.class)
public class OptionsRenderState1480321053Mixin {
        @Inject(at = @At("HEAD"), method = "getBackgroundOpacity(F)F", cancellable = true)
    private void getBackgroundOpacity__1603515210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603515210L))
            info.setReturnValue(8.96219E7F);
    }


}
