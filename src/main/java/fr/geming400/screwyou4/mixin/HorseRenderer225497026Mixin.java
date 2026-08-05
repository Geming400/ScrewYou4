package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HorseRenderer.class)
public class HorseRenderer225497026Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HorseRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1743554980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743554980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2096955435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096955435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__336724781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-336724781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/Horse;Lnet/minecraft/client/renderer/entity/state/HorseRenderState;F)V", cancellable = true)
    private void extractRenderState_314580632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(314580632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/client/renderer/entity/state/EquineRenderState;F)V", cancellable = true)
    private void extractRenderState__1670439176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1670439176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1444976461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1444976461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_478668005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478668005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/HorseRenderState;", cancellable = true)
    private void createRenderState_1299856667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299856667L))
            info.setReturnValue(null);
    }


}
