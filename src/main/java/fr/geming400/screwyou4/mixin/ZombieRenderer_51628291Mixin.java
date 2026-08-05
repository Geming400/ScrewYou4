package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieRenderer.class)
public class ZombieRenderer_51628291Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState__1794193560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794193560L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombieRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_304799269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304799269L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
