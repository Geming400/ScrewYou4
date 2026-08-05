package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.BlockDisplayEntityRenderState.class)
public class BlockDisplayEntityRenderState1032111957Mixin {
        @Inject(at = @At("HEAD"), method = "hasSubState()Z", cancellable = true)
    private void hasSubState__1579401983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579401983L))
            info.setReturnValue(true);
    }


}
