package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.TextDisplayEntityRenderState.class)
public class TextDisplayEntityRenderState_419647151Mixin {
        @Inject(at = @At("HEAD"), method = "hasSubState()Z", cancellable = true)
    private void hasSubState_457925733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457925733L))
            info.setReturnValue(false);
    }


}
