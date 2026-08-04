package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BeeRenderer.class)
public class BeeRenderer976235991Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BeeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__533052178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533052178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1316094672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1316094672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1203355010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1203355010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1996100194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1996100194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/bee/Bee;Lnet/minecraft/client/renderer/entity/state/BeeRenderState;F)V", cancellable = true)
    private void extractRenderState__807743158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-807743158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_387599547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387599547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BeeRenderState;", cancellable = true)
    private void createRenderState__153641868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153641868L))
            info.setReturnValue(null);
    }


}
