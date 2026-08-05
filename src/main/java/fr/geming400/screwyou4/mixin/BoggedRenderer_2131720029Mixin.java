package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BoggedRenderer.class)
public class BoggedRenderer_2131720029Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_275576911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275576911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__190732433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190732433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1569498221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1569498221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState__2104676266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2104676266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_461246541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(461246541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/skeleton/Bogged;Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;F)V", cancellable = true)
    private void extractRenderState__2018046848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2018046848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/skeleton/AbstractSkeleton;Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;F)V", cancellable = true)
    private void extractRenderState__1502334302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1502334302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__1910076289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910076289L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;", cancellable = true)
    private void createRenderState_1906410600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906410600L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.BoggedRenderState());
    }


}
