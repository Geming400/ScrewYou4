package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.StrayRenderer.class)
public class StrayRenderer1788061438Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__534391023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534391023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__200815280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200815280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_1599575755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599575755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2041232417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041232417L))
            info.setReturnValue(null);
    }


}
