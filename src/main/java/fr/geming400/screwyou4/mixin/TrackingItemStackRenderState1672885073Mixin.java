package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.TrackingItemStackRenderState.class)
public class TrackingItemStackRenderState1672885073Mixin {
        @Inject(at = @At("HEAD"), method = "appendModelIdentityElement(Ljava/lang/Object;)V", cancellable = true)
    private void appendModelIdentityElement_1591422609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591422609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModelIdentity()Ljava/lang/Object;", cancellable = true)
    private void getModelIdentity__699807363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699807363L))
            info.setReturnValue(new java.lang.Object());
    }


}
