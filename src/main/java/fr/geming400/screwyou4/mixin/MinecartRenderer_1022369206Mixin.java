package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MinecartRenderer.class)
public class MinecartRenderer_1022369206Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MinecartRenderState;", cancellable = true)
    private void createRenderState_1438258729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438258729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_433732761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433732761L))
            info.setReturnValue(null);
    }


}
