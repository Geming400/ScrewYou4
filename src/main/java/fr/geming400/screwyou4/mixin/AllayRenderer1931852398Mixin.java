package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.AllayRenderer.class)
public class AllayRenderer1931852398Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AllayRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1397673236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397673236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__390600063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390600063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1369630591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1369630591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/allay/Allay;Lnet/minecraft/client/renderer/entity/state/AllayRenderState;F)V", cancellable = true)
    private void extractRenderState__1444686186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444686186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_261378911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(261378911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2109943919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109943919L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AllayRenderState;", cancellable = true)
    private void createRenderState_179852419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179852419L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.AllayRenderState());
    }


}
