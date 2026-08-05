package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SpectralArrowRenderer.class)
public class SpectralArrowRenderer_958877734Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1212048712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212048712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;", cancellable = true)
    private void createRenderState__228345686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228345686L))
            info.setReturnValue(null);
    }


}
