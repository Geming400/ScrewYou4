package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DolphinRenderer.class)
public class DolphinRenderer_1076344653Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__955455091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955455091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1246107809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246107809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_514122845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(514122845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__594128835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-594128835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/dolphin/Dolphin;Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;F)V", cancellable = true)
    private void extractRenderState_940434437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940434437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1329515631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329515631L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/DolphinRenderState;", cancellable = true)
    private void createRenderState_1549475174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549475174L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.DolphinRenderState());
    }


}
