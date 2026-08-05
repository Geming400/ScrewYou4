package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ParchedRenderer.class)
public class ParchedRenderer_452968966Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1839361698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839361698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1630659939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630659939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState__1258598573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258598573L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SkeletonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__135667479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135667479L))
            info.setReturnValue(null);
    }


}
