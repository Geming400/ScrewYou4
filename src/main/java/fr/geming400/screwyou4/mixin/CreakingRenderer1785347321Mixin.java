package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CreakingRenderer.class)
public class CreakingRenderer1785347321Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1163493284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163493284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__506983342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506983342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2012466340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2012466340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/creaking/Creaking;Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;F)V", cancellable = true)
    private void extractRenderState__454523250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-454523250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1489755772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1489755772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CreakingRenderState;", cancellable = true)
    private void createRenderState__344743780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344743780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1196710877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196710877L))
            info.setReturnValue(null);
    }


}
