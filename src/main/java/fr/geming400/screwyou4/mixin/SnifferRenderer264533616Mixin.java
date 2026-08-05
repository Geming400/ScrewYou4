package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SnifferRenderer.class)
public class SnifferRenderer264533616Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_491652635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(491652635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/sniffer/Sniffer;Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;F)V", cancellable = true)
    private void extractRenderState__1838499656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838499656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1284397819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284397819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__324102828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-324102828L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;", cancellable = true)
    private void createRenderState_385552934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385552934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SnifferRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1751105678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751105678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2027797047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027797047L))
            info.setReturnValue(null);
    }


}
