package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WanderingTraderRenderer.class)
public class WanderingTraderRenderer1344538520Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_765890199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765890199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__947792143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947792143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1571657539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571657539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1930564573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1930564573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/npc/wanderingtrader/WanderingTrader;Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;F)V", cancellable = true)
    private void extractRenderState__1225584840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1225584840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_755902076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755902076L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;", cancellable = true)
    private void createRenderState_650044959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650044959L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.VillagerRenderState());
    }


}
