package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VindicatorRenderer.class)
public class VindicatorRenderer352603888Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_605774867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605774867L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;", cancellable = true)
    private void createRenderState__985722584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985722584L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.IllagerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__398852141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398852141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1969848573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1969848573L))
            info.setReturnValue(null);
    }


}
