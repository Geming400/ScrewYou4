package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GiantMobRenderer.class)
public class GiantMobRenderer_1438159534Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1160434310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160434310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__884292928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884292928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_875937726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(875937726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__232313954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-232313954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Giant;Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;F)V", cancellable = true)
    private void extractRenderState__2005134226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2005134226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1691330512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691330512L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState__407662317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407662317L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombieRenderState());
    }


}
