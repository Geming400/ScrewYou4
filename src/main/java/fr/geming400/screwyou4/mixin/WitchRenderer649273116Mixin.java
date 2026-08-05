package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitchRenderer.class)
public class WitchRenderer649273116Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_876392135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(876392135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Witch;Lnet/minecraft/client/renderer/entity/state/WitchRenderState;F)V", cancellable = true)
    private void extractRenderState__161121400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-161121400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1669137319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1669137319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_60636672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60636672L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitchRenderState;", cancellable = true)
    private void createRenderState__1228320514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228320514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1684550578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684550578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1643057547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643057547L))
            info.setReturnValue(null);
    }


}
