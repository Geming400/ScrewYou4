package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WolfRenderer.class)
public class WolfRenderer1344852073Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__977600388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977600388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WolfRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1153096554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153096554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_782630266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(782630266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__325621414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325621414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/wolf/Wolf;Lnet/minecraft/client/renderer/entity/state/WolfRenderState;F)V", cancellable = true)
    private void extractRenderState_1454287140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1454287140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1598023052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598023052L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WolfRenderState;", cancellable = true)
    private void createRenderState_341099131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341099131L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WolfRenderState());
    }


}
