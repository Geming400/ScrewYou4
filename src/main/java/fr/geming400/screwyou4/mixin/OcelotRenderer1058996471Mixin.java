package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.OcelotRenderer.class)
public class OcelotRenderer1058996471Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FelineRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2106398557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106398557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1263455990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263455990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_496774664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(496774664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__611477016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-611477016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/feline/Ocelot;Lnet/minecraft/client/renderer/entity/state/FelineRenderState;F)V", cancellable = true)
    private void extractRenderState__1852795010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1852795010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1312167450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312167450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FelineRenderState;", cancellable = true)
    private void createRenderState__2017856598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017856598L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.FelineRenderState());
    }


}
