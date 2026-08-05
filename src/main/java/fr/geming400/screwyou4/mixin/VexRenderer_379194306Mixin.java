package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VexRenderer.class)
public class VexRenderer_379194306Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1913136358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913136358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VexRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_769490001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769490001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1399058508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1399058508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_606313324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606313324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Vex;Lnet/minecraft/client/renderer/entity/state/VexRenderState;F)V", cancellable = true)
    private void extractRenderState_2111242345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2111242345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VexRenderState;", cancellable = true)
    private void createRenderState__875580091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875580091L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.VexRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__209442139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209442139L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
