package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EndermanRenderer.class)
public class EndermanRenderer_870682839Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1097801857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1097801857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/EnderMan;Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;F)V", cancellable = true)
    private void extractRenderState_1944759318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1944759318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1890547041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1890547041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_282046394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(282046394L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;", cancellable = true)
    private void createRenderState__2116383063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116383063L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EndermanRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_803215924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803215924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_686772067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686772067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__271853559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271853559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1421647825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421647825L))
            info.setReturnValue(null);
    }


}
