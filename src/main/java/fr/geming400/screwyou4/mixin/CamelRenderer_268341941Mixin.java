package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CamelRenderer.class)
public class CamelRenderer_268341941Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2054110521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054110521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_653987613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653987613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1402131547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1402131547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__293879867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-293879867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private void extractRenderState_479486629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(479486629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractAdditionalState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private static void extractAdditionalState_1478577772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1478577772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CamelRenderState;", cancellable = true)
    private void createRenderState_393095462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393095462L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CamelRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_521512919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521512919L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
