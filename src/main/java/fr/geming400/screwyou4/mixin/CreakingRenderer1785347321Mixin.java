package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CreakingRenderer.class)
public class CreakingRenderer1785347321Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1068741098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068741098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__537105140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537105140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1223125514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1223125514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_114873834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114873834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/creaking/Creaking;Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;F)V", cancellable = true)
    private void extractRenderState__695114520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-695114520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2038518300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038518300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;", cancellable = true)
    private void createRenderState_1178338075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178338075L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CreakingRenderState());
    }


}
