package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherSkeletonRenderer.class)
public class WitherSkeletonRenderer_402244425Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_655415403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655415403L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_213758741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213758741L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SkeletonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1586632294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586632294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1920208037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920208037L))
            info.setReturnValue(null);
    }


}
