package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WanderingTraderRenderer.class)
public class WanderingTraderRenderer1344538520Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_860642385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860642385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__977913941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977913941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_782316713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(782316713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__325934967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325934967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/npc/wanderingtrader/WanderingTrader;Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;F)V", cancellable = true)
    private void extractRenderState_1644512530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1644512530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1597709499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597709499L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;", cancellable = true)
    private void createRenderState__2121840482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121840482L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.VillagerRenderState());
    }


}
