package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FrogRenderer.class)
public class FrogRenderer_940498117Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1351832547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351832547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FrogRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__677972059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677972059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1960362319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960362319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1167617135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1167617135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/frog/Frog;Lnet/minecraft/client/renderer/entity/state/FrogRenderState;F)V", cancellable = true)
    private void extractRenderState__1981657529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981657529L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FrogRenderState;", cancellable = true)
    private void createRenderState__235540823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235540823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_351861672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351861672L))
            info.setReturnValue(null);
    }


}
