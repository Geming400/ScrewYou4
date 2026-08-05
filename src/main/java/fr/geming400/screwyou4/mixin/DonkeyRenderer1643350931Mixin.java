package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DonkeyRenderer.class)
public class DonkeyRenderer1643350931Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_950543196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950543196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__648979732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648979732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1870469950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1870469950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1631752162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1631752162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/client/renderer/entity/state/EquineRenderState;F)V", cancellable = true)
    private void extractRenderState__11994001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11994001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractChestedHorse;Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;F)V", cancellable = true)
    private void extractRenderState_1646186118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1646186118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;", cancellable = true)
    private void createRenderState__213865136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213865136L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.DonkeyRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1054714487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054714487L))
            info.setReturnValue(null);
    }


}
