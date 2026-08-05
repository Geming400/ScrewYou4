package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SlimeRenderer.class)
public class SlimeRenderer_1283462947Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_694826502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694826502L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;", cancellable = true)
    private void createRenderState_1047939653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1047939653L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SlimeRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_337323955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337323955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1008867717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008867717L))
            info.setReturnValue(null);
    }


}
