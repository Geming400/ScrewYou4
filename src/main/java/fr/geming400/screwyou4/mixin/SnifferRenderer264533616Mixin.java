package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SnifferRenderer.class)
public class SnifferRenderer264533616Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1615614868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615614868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2057918845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057918845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__297688191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-297688191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1405939871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1405939871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/sniffer/Sniffer;Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;F)V", cancellable = true)
    private void extractRenderState_799331346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799331346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_517704595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517704595L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;", cancellable = true)
    private void createRenderState_711779271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711779271L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.SnifferRenderState());
    }


}
