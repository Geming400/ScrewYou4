package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ItemDisplayEntityRenderState.class)
public class ItemDisplayEntityRenderState_628837449Mixin {
        @Inject(at = @At("HEAD"), method = "hasSubState()Z", cancellable = true)
    private void hasSubState__1982676492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982676492L))
            info.setReturnValue(false);
    }


}
