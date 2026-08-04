package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.AllayRenderer.class)
public class AllayRenderer1931852398Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AllayRenderState;", cancellable = true)
    private void createRenderState_1399623330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399623330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1343215954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343215954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1343250695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1343250695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2135995879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2135995879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/allay/Allay;Lnet/minecraft/client/renderer/entity/state/AllayRenderState;F)V", cancellable = true)
    private void extractRenderState_2105782204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2105782204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__360478265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360478265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1768763534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768763534L))
            info.setReturnValue(null);
    }


}
