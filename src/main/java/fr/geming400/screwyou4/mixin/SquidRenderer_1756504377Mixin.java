package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SquidRenderer.class)
public class SquidRenderer_1756504377Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__535826287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535826287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SquidRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__713463009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713463009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1983623395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1983623395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1518598717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1518598717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/squid/Squid;Lnet/minecraft/client/renderer/entity/state/SquidRenderState;F)V", cancellable = true)
    private void extractRenderState_1931683419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1931683419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SquidRenderState;", cancellable = true)
    private void createRenderState_425018693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425018693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1167867932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167867932L))
            info.setReturnValue(null);
    }


}
