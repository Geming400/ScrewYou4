package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SpiderRenderer.class)
public class SpiderRenderer_231738116Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2060721508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060721508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/spider/Spider;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1855311406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855311406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_458857134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(458857134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1251602318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1251602318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__356898329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356898329L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState__462339024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462339024L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LivingEntityRenderState());
    }


}
