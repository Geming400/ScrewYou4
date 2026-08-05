package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SkeletonRenderer.class)
public class SkeletonRenderer1773270052Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__519060611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519060611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__310358852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310358852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_61702514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61702514L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SkeletonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1184633608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184633608L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
