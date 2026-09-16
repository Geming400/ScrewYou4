package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VexRenderer.class)
public class VexRenderer_379194306Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_632365284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632365284L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/VexRenderState;", cancellable = true)
    private void createRenderState__1855619226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855619226L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.VexRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1943258156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943258156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/VexRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_241730135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241730135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1291279182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1291279182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__183027502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-183027502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Vex;Lnet/minecraft/client/renderer/entity/state/VexRenderState;F)V", cancellable = true)
    private void extractRenderState__531047345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-531047345L))
            info.cancel();
    }


}
