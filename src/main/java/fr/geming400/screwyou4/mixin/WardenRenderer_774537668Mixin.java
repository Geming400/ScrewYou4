package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WardenRenderer.class)
public class WardenRenderer_774537668Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1027708646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027708646L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WardenRenderState;", cancellable = true)
    private void createRenderState__460648472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460648472L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WardenRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1547914794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547914794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WardenRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_108490045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108490045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/warden/Warden;Lnet/minecraft/client/renderer/entity/state/WardenRenderState;F)V", cancellable = true)
    private void extractRenderState__954743761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-954743761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__895935820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-895935820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_212315860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(212315860L))
            info.cancel();
    }


}
