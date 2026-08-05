package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HoglinRenderer.class)
public class HoglinRenderer1654680936Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1465936694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465936694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__667771525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-667771525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1092459129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092459129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__15792551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-15792551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/hoglin/Hoglin;Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;F)V", cancellable = true)
    private void extractRenderState_428035496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(428035496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;F)V", cancellable = true)
    private void extractRenderState__1015462514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1015462514L))
            info.cancel();
    }


}
