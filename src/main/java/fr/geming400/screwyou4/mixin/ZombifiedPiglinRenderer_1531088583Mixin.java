package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombifiedPiglinRenderer.class)
public class ZombifiedPiglinRenderer_1531088583Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1089681473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089681473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__791363879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791363879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_968866775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(968866775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__139384905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-139384905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_1589659584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1589659584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/zombie/ZombifiedPiglin;Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;F)V", cancellable = true)
    private void extractRenderState__1635018813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635018813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;", cancellable = true)
    private void createRenderState_309881702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309881702L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombifiedPiglinRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1784259561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784259561L))
            info.setReturnValue(null);
    }


}
