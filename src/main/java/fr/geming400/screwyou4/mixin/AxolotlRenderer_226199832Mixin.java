package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.AxolotlRenderer.class)
public class AxolotlRenderer_226199832Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_479370810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479370810L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;", cancellable = true)
    private void createRenderState__1317078298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317078298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2096252630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096252630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_179588291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179588291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__336021976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-336021976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/axolotl/Axolotl;Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;F)V", cancellable = true)
    private void extractRenderState_335450193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335450193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1444273656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444273656L))
            info.cancel();
    }


}
