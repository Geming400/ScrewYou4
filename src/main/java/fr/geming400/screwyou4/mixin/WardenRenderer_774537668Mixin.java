package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WardenRenderer.class)
public class WardenRenderer_774537668Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WardenRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1272612605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272612605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1517792996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517792996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1001656686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1001656686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/warden/Warden;Lnet/minecraft/client/renderer/entity/state/WardenRenderState;F)V", cancellable = true)
    private void extractRenderState__1489331627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1489331627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1794401870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1794401870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WardenRenderState;", cancellable = true)
    private void createRenderState__1302455895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302455895L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WardenRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_185901223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185901223L))
            info.setReturnValue(null);
    }


}
