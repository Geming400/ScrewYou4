package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GoatRenderer.class)
public class GoatRenderer36430322Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/GoatRenderState;", cancellable = true)
    private void createRenderState__1242236659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242236659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_289601301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289601301L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2008945157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008945157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1213575862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213575862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1634043165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1634043165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/goat/Goat;Lnet/minecraft/client/renderer/entity/state/GoatRenderState;F)V", cancellable = true)
    private void extractRenderState_1045412516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1045412516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__525791485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-525791485L))
            info.cancel();
    }


}
