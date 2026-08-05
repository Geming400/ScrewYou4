package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BeeRenderer.class)
public class BeeRenderer976235991Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BeeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1060812044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060812044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1346216470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346216470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_414014184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(414014184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__694237496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694237496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/bee/Bee;Lnet/minecraft/client/renderer/entity/state/BeeRenderState;F)V", cancellable = true)
    private void extractRenderState_900703140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(900703140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1229406970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229406970L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BeeRenderState;", cancellable = true)
    private void createRenderState__1133681003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133681003L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.BeeRenderState());
    }


}
