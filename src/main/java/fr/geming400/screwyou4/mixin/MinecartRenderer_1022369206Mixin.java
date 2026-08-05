package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MinecartRenderer.class)
public class MinecartRenderer_1022369206Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MinecartRenderState;", cancellable = true)
    private void createRenderState__1333626712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333626712L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.MinecartRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1275540184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275540184L))
            info.setReturnValue(null);
    }


}
