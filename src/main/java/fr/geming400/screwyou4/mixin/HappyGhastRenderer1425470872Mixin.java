package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HappyGhastRenderer.class)
public class HappyGhastRenderer1425470872Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_521095350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521095350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__896981589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896981589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_863249065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(863249065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__245002615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-245002615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/happyghast/HappyGhast;Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;F)V", cancellable = true)
    private void extractRenderState_546672708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(546672708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;", cancellable = true)
    private void createRenderState__445301607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445301607L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.HappyGhastRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1678641851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678641851L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
