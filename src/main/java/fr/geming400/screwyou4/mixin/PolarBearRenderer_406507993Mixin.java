package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PolarBearRenderer.class)
public class PolarBearRenderer_406507993Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;", cancellable = true)
    private void createRenderState__1828770235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828770235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__182128452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-182128452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1426372195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1426372195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_633627011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633627011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/polarbear/PolarBear;Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;F)V", cancellable = true)
    private void extractRenderState_1033710075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033710075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PolarBearRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1207595999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207595999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1885822671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885822671L))
            info.setReturnValue(null);
    }


}
