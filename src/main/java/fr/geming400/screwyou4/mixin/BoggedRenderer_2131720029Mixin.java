package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BoggedRenderer.class)
public class BoggedRenderer_2131720029Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1936128249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1936128249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_830280316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830280316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/skeleton/AbstractSkeleton;Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;F)V", cancellable = true)
    private void extractRenderState_1685737032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1685737032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1143383065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1143383065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/skeleton/Bogged;Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;F)V", cancellable = true)
    private void extractRenderState__360910554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360910554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;", cancellable = true)
    private void createRenderState_1064603177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064603177L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.BoggedRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1543083584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543083584L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__160610635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160610635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1105525739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105525739L))
            info.setReturnValue(null);
    }


}
