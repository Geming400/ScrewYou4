package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.RavagerRenderer.class)
public class RavagerRenderer1610928079Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1637443730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637443730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__681402584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681402584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1838047098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1838047098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1664175014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1664175014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Ravager;Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;F)V", cancellable = true)
    private void extractRenderState_1875178645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1875178645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1022291635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022291635L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;", cancellable = true)
    private void createRenderState__2099118748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099118748L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.RavagerRenderState());
    }


}
