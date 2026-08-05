package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WolfRenderer.class)
public class WolfRenderer1344852073Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/wolf/Wolf;Lnet/minecraft/client/renderer/entity/state/WolfRenderState;F)V", cancellable = true)
    private void extractRenderState_493081022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(493081022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1930251020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1930251020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1571971092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571971092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_756215629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756215629L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WolfRenderState;", cancellable = true)
    private void createRenderState_657541244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657541244L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WolfRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WolfRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1972409892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972409892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__947478590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947478590L))
            info.setReturnValue(null);
    }


}
