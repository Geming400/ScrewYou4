package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherSkeletonRenderer.class)
public class WitherSkeletonRenderer_402244425Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__186392020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186392020L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;", cancellable = true)
    private void createRenderState__1309323114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309323114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1681384480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1681384480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1890086239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890086239L))
            info.setReturnValue(null);
    }


}
