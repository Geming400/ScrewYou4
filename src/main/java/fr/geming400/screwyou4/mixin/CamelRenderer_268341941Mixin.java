package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CamelRenderer.class)
public class CamelRenderer_268341941Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2023988723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023988723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1025077911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025077911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractAdditionalState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private static void extractAdditionalState__265012029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-265012029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_495460959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495460959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1288206143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288206143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private void extractRenderState__265012277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-265012277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CamelRenderState;", cancellable = true)
    private void createRenderState_1612866373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612866373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__320294504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320294504L))
            info.setReturnValue(null);
    }


}
