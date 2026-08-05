package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EndermiteRenderer.class)
public class EndermiteRenderer_88552918Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState__605524222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605524222L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LivingEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__500083527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500083527L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2091060590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091060590L))
            info.setReturnValue(null);
    }


}
