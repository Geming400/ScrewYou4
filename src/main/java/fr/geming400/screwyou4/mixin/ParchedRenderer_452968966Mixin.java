package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ParchedRenderer.class)
public class ParchedRenderer_452968966Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_706139944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706139944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState_264483282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264483282L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SkeletonRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1535907753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535907753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1869483496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869483496L))
            info.setReturnValue(null);
    }


}
