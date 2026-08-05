package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HoglinRenderer.class)
public class HoglinRenderer1654680936Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_84834044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84834044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__637649727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637649727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1881799955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1881799955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1620422157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1620422157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/hoglin/Hoglin;Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;F)V", cancellable = true)
    private void extractRenderState__106552370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-106552370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;F)V", cancellable = true)
    private void extractRenderState_623343924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(623343924L))
            info.cancel();
    }


}
