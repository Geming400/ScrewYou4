package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FoxRenderer.class)
public class FoxRenderer1311113700Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FoxRenderState;", cancellable = true)
    private void createRenderState__932153842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932153842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_722477256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(722477256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1538232719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1538232719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fox/Fox;Lnet/minecraft/client/renderer/entity/state/FoxRenderState;F)V", cancellable = true)
    private void extractRenderState_740850128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(740850128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1963989393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1963989393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FoxRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1207728014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207728014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__981216963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981216963L))
            info.setReturnValue(null);
    }


}
