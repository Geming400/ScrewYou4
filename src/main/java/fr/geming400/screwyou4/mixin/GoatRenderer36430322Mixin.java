package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GoatRenderer.class)
public class GoatRenderer36430322Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_263549341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(263549341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/goat/Goat;Lnet/minecraft/client/renderer/entity/state/GoatRenderState;F)V", cancellable = true)
    private void extractRenderState_84206398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(84206398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1056294525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056294525L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__552206122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552206122L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/GoatRenderState;", cancellable = true)
    private void createRenderState__925794546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925794546L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.GoatRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GoatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_394262524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394262524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2039066955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039066955L))
            info.setReturnValue(null);
    }


}
