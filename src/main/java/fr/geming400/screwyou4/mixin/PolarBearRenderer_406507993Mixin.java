package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PolarBearRenderer.class)
public class PolarBearRenderer_406507993Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;", cancellable = true)
    private void createRenderState__1857872986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857872986L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.PolarBearRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_659678971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659678971L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1915944469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915944469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__150053531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150053531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1263965495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1263965495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/polarbear/PolarBear;Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;F)V", cancellable = true)
    private void extractRenderState_1753733589(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753733589L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__155713815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-155713815L))
            info.cancel();
    }


}
