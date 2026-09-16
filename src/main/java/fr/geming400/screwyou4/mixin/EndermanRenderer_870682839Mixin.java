package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EndermanRenderer.class)
public class EndermanRenderer_870682839Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_483080661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483080661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset__2020537660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020537660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1451769623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451769623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__177101373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177101373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__799790649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-799790649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_308461031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308461031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/EnderMan;Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;F)V", cancellable = true)
    private void extractRenderState__745578372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-745578372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;", cancellable = true)
    private void createRenderState__593301208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593301208L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EndermanRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1123853817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1123853817L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
