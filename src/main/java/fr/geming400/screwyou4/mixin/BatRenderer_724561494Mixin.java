package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BatRenderer.class)
public class BatRenderer_724561494Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_747327743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747327743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1597890968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597890968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_162339686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162339686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__945911994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-945911994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/ambient/Bat;Lnet/minecraft/client/renderer/entity/state/BatRenderState;F)V", cancellable = true)
    private void extractRenderState__1968081651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1968081651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_977732472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977732472L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BatRenderState;", cancellable = true)
    private void createRenderState_1795221862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795221862L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.BatRenderState());
    }


}
