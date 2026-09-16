package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TippableArrowRenderer.class)
public class TippableArrowRenderer1891152847Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TippableArrowRenderState;", cancellable = true)
    private void createRenderState__1628573755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628573755L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TippableArrowRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2144323826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144323826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;F)V", cancellable = true)
    private void extractRenderState_1621501084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1621501084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/arrow/Arrow;Lnet/minecraft/client/renderer/entity/state/TippableArrowRenderState;F)V", cancellable = true)
    private void extractRenderState_278668169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(278668169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1328931040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1328931040L))
            info.cancel();
    }


}
