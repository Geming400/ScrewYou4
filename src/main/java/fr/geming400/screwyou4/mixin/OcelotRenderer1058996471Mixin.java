package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.OcelotRenderer.class)
public class OcelotRenderer1058996471Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FelineRenderState;", cancellable = true)
    private void createRenderState_1435303275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435303275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_470360027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(470360027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2078860674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078860674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1286115490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1286115490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/feline/Ocelot;Lnet/minecraft/client/renderer/entity/state/FelineRenderState;F)V", cancellable = true)
    private void extractRenderState__2008587112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2008587112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FelineRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_807466089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807466089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1233334192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233334192L))
            info.setReturnValue(null);
    }


}
