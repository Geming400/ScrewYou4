package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ArmadilloRenderer.class)
public class ArmadilloRenderer326897722Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__792597740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-792597740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1995554739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995554739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__235324085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-235324085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1343575765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1343575765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/armadillo/Armadillo;Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;F)V", cancellable = true)
    private void extractRenderState_454134782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454134782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_580068701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580068701L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;", cancellable = true)
    private void createRenderState_1594227355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594227355L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ArmadilloRenderState());
    }


}
