package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SkeletonRenderer.class)
public class SkeletonRenderer1773270052Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__549182409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549182409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__215606666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215606666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_1584784369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584784369L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SkeletonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2026441031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026441031L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
