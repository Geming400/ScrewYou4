package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EndCrystalRenderer.class)
public class EndCrystalRenderer1132554226Mixin {
        @Inject(at = @At("HEAD"), method = "getY(F)F", cancellable = true)
    private static void getY__1951281789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951281789L))
            info.setReturnValue(2.249857E8F);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1640662578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1640662578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__334826618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334826618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1359673245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1359673245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;F)V", cancellable = true)
    private void extractRenderState__932032667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-932032667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;", cancellable = true)
    private void createRenderState__289692274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289692274L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EndCrystalRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_543917782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543917782L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_369962470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369962470L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__42255066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42255066L))
            info.setReturnValue(true);
    }


}
