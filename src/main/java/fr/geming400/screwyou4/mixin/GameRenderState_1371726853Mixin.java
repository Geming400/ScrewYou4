package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.GameRenderState.class)
public class GameRenderState_1371726853Mixin {
        @Inject(at = @At("HEAD"), method = "useShaderTransparency()Z", cancellable = true)
    private void useShaderTransparency_1410005435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410005435L))
            info.setReturnValue(null);
    }


}
