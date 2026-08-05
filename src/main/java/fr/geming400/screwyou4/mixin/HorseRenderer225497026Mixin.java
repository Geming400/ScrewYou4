package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HorseRenderer.class)
public class HorseRenderer225497026Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1245361229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245361229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_452616045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(452616045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/Horse;Lnet/minecraft/client/renderer/entity/state/HorseRenderState;F)V", cancellable = true)
    private void extractRenderState__1290048974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1290048974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/client/renderer/entity/state/EquineRenderState;F)V", cancellable = true)
    private void extractRenderState__1429847906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1429847906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__363139418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363139418L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/HorseRenderState;", cancellable = true)
    private void createRenderState__1775339718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775339718L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.HorseRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HorseRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2114645278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114645278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2066833637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066833637L))
            info.setReturnValue(null);
    }


}
