package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TippableArrowRenderer.class)
public class TippableArrowRenderer1891152847Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TippableArrowRenderState;", cancellable = true)
    private void createRenderState_1762761444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762761444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1302516403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302516403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;F)V", cancellable = true)
    private void extractRenderState_901477570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(901477570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2118271866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2118271866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/arrow/Arrow;Lnet/minecraft/client/renderer/entity/state/TippableArrowRenderState;F)V", cancellable = true)
    private void extractRenderState__441355345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-441355345L))
            info.cancel();
    }


}
