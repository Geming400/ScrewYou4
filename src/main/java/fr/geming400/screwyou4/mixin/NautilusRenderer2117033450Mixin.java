package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.NautilusRenderer.class)
public class NautilusRenderer2117033450Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;", cancellable = true)
    private void createRenderState__746953603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746953603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__1924762867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924762867L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__205419011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205419011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1630056138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630056138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1554811643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1554811643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/nautilus/AbstractNautilus;Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;F)V", cancellable = true)
    private void extractRenderState_584067814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(584067814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_446559963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(446559963L))
            info.cancel();
    }


}
