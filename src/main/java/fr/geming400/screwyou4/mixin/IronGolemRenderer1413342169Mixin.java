package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.IronGolemRenderer.class)
public class IronGolemRenderer1413342169Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;", cancellable = true)
    private void createRenderState_1071959288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071959288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_824705725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824705725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1861760924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861760924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1640461188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1640461188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/IronGolem;Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__1364331874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1364331874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__878988494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878988494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_829644910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829644910L))
            info.setReturnValue(null);
    }


}
