package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GhastRenderer.class)
public class GhastRenderer1765272790Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/GhastRenderState;", cancellable = true)
    private void createRenderState_1680688467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680688467L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.GhastRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_2018443769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018443769L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__557179671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557179671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GhastRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1794334188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794334188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_94799303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(94799303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Ghast;Lnet/minecraft/client/renderer/entity/state/GhastRenderState;F)V", cancellable = true)
    private void extractRenderState_586649268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(586649268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1203050983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1203050983L))
            info.cancel();
    }


}
