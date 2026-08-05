package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PiglinRenderer.class)
public class PiglinRenderer1409998554Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1847931766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847931766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__912453907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912453907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__260474933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-260474933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_1468569556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468569556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_847776747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(847776747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/piglin/AbstractPiglin;Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;F)V", cancellable = true)
    private void extractRenderState__1044728598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044728598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;", cancellable = true)
    private void createRenderState__1146925411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146925411L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.PiglinRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1663169533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663169533L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
