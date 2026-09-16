package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CopperGolemRenderer.class)
public class CopperGolemRenderer1614996392Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1868167371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868167371L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;", cancellable = true)
    private void createRenderState__773127497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773127497L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CopperGolemRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1416652012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416652012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__707456069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707456069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/CopperGolem;Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__643910487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-643910487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1052774585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1052774585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__55477095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-55477095L))
            info.cancel();
    }


}
