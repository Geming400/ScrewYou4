package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.AxolotlRenderer.class)
public class AxolotlRenderer_226199832Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_315079101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315079101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2066130832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066130832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_453318850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(453318850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/axolotl/Axolotl;Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;F)V", cancellable = true)
    private void extractRenderState_1992586487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1992586487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1246064034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246064034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__362436613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362436613L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;", cancellable = true)
    private void createRenderState__1643304635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643304635L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.AxolotlRenderState());
    }


}
