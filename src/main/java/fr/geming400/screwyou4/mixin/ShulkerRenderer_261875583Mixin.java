package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ShulkerRenderer.class)
public class ShulkerRenderer_261875583Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_488994601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(488994601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1281739785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1281739785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Shulker;Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;F)V", cancellable = true)
    private void extractRenderState__312207520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-312207520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__326760862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326760862L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;", cancellable = true)
    private void createRenderState_2076226757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076226757L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ShulkerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__500716174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500716174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/monster/Shulker;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_695890220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695890220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_2114644433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114644433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_194408668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194408668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_265180843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(265180843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2030455081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030455081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getTextureLocation__2103199740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103199740L))
            info.setReturnValue(null);
    }


}
