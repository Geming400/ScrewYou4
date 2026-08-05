package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.WolfRenderState.class)
public class WolfRenderState1337733755Mixin {
        @Inject(at = @At("HEAD"), method = "getBodyRollAngle(F)F", cancellable = true)
    private void getBodyRollAngle__1148489806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148489806L))
            info.setReturnValue(8.181991E8F);
    }


}
