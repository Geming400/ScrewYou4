package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.StrayRenderer.class)
public class StrayRenderer1788061438Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1199424994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199424994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_76493900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76493900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__295567466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295567466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__504269225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504269225L))
            info.setReturnValue(null);
    }


}
