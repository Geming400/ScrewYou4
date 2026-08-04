package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DolphinRenderer.class)
public class DolphinRenderer_1076344653Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;", cancellable = true)
    private void createRenderState_1223248837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223248837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_487708208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487708208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2096208855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2096208855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1303463671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303463671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/dolphin/Dolphin;Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;F)V", cancellable = true)
    private void extractRenderState__1697396565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1697396565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__819964281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819964281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1215986011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215986011L))
            info.setReturnValue(null);
    }


}
