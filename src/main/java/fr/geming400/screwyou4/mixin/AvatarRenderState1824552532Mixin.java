package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.AvatarRenderState.class)
public class AvatarRenderState1824552532Mixin {
        @Inject(at = @At("HEAD"), method = "fallFlyingScale()F", cancellable = true)
    private void fallFlyingScale_1862811895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862811895L))
            info.setReturnValue(8.393609E8F);
    }


}
