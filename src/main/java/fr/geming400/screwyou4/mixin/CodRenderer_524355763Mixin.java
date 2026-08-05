package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CodRenderer.class)
public class CodRenderer_524355763Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__64280682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64280682L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState__169721377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169721377L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LivingEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1768103861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768103861L))
            info.setReturnValue(null);
    }


}
