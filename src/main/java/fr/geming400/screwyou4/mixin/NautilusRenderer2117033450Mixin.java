package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.NautilusRenderer.class)
public class NautilusRenderer2117033450Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1950814827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1950814827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1158069643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1158069643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/nautilus/AbstractNautilus;Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;F)V", cancellable = true)
    private void extractRenderState__144375168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-144375168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1528397006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528397006L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;", cancellable = true)
    private void createRenderState_2024931838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024931838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1724808324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724808324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__175297213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175297213L))
            info.setReturnValue(null);
    }


}
