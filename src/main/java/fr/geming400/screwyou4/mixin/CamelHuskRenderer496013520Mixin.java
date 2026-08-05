package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CamelHuskRenderer.class)
public class CamelHuskRenderer496013520Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CamelRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_881659193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881659193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1826438941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826438941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__66208287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-66208287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1174459967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1174459967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/camel/Camel;Lnet/minecraft/client/renderer/entity/state/CamelRenderState;F)V", cancellable = true)
    private void extractRenderState_707158209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707158209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_749184499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749184499L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CamelRenderState;", cancellable = true)
    private void createRenderState_620767042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620767042L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CamelRenderState());
    }


}
