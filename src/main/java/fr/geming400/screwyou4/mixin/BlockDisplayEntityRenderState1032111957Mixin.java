package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.BlockDisplayEntityRenderState.class)
public class BlockDisplayEntityRenderState1032111957Mixin {
        @Inject(at = @At("HEAD"), method = "hasSubState()Z", cancellable = true)
    private void hasSubState_1070390540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070390540L))
            info.setReturnValue(null);
    }


}
