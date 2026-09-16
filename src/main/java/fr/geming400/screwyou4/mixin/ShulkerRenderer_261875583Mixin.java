package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ShulkerRenderer.class)
public class ShulkerRenderer_261875583Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_780385872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780385872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset__125726595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125726595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2060576879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060576879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getTextureLocation_473231370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473231370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_129690033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129690033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_2124891483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124891483L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/monster/Shulker;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__731074717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731074717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__300346225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-300346225L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1408597905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408597905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Shulker;Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;F)V", cancellable = true)
    private void extractRenderState__11096762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11096762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ShulkerRenderState;", cancellable = true)
    private void createRenderState__1892514202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892514202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_515046561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515046561L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
