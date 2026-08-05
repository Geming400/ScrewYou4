package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PandaRenderer.class)
public class PandaRenderer19105135Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1991619970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991619970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PandaRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1133223372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133223372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__543116672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-543116672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1651368352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1651368352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/panda/Panda;Lnet/minecraft/client/renderer/entity/state/PandaRenderState;F)V", cancellable = true)
    private void extractRenderState__411686796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-411686796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PandaRenderState;", cancellable = true)
    private void createRenderState_216302085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216302085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_272276114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272276114L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
