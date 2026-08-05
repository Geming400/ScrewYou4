package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PiglinRenderer.class)
public class PiglinRenderer1409998554Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_466829116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466829116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__882332109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882332109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1637117573(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1637117573L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1865104539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1865104539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_108558842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(108558842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/piglin/AbstractPiglin;Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;F)V", cancellable = true)
    private void extractRenderState__1764752112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1764752112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PiglinRenderState;", cancellable = true)
    private void createRenderState__1988732834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988732834L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.PiglinRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_821362110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821362110L))
            info.setReturnValue(null);
    }


}
