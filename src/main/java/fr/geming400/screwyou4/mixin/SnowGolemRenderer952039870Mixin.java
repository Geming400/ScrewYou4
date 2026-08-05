package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SnowGolemRenderer.class)
public class SnowGolemRenderer952039870Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1635223054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635223054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1340290793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340290793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1179158889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179158889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1971904073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1971904073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/SnowGolem;Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__959816903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-959816903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_363403426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363403426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;", cancellable = true)
    private void createRenderState_351239746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351239746L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SnowGolemRenderState());
    }


}
