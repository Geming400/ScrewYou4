package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HappyGhastRenderer.class)
public class HappyGhastRenderer1425470872Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1849632221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1849632221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/happyghast/HappyGhast;Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;F)V", cancellable = true)
    private void extractRenderState__607156642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-607156642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1652589891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1652589891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_836834428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836834428L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;", cancellable = true)
    private void createRenderState_456883674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456883674L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.HappyGhastRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__341442180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341442180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__866859791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866859791L))
            info.setReturnValue(null);
    }


}
