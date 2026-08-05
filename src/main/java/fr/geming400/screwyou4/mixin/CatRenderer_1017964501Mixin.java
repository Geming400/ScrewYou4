package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CatRenderer.class)
public class CatRenderer_1017964501Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1304487961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304487961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1478740253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478740253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_455742693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455742693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__652508987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-652508987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/feline/Cat;Lnet/minecraft/client/renderer/entity/state/CatRenderState;F)V", cancellable = true)
    private void extractRenderState__100323780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-100323780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1271135479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271135479L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CatRenderState;", cancellable = true)
    private void createRenderState__853032730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853032730L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CatRenderState());
    }


}
