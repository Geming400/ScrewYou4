package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SnowGolemRenderer.class)
public class SnowGolemRenderer952039870Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_277573524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277573524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1370412591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370412591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_389818063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(389818063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__718433617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-718433617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/SnowGolem;Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__34928621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-34928621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1205210849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205210849L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SnowGolemRenderState;", cancellable = true)
    private void createRenderState_322136995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322136995L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SnowGolemRenderState());
    }


}
