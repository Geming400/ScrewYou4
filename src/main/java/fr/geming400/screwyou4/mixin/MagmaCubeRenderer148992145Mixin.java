package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MagmaCubeRenderer.class)
public class MagmaCubeRenderer148992145Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__439644299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439644299L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;", cancellable = true)
    private void createRenderState__86531148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86531148L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SlimeRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2143338518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143338518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__797146846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797146846L))
            info.setReturnValue(null);
    }


}
