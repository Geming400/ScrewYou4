package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TntMinecartRenderer.class)
public class TntMinecartRenderer_1982400030Mixin {
        @Inject(at = @At("HEAD"), method = "submitWhiteSolidBlock(Lnet/minecraft/client/renderer/block/BlockModelRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IZI)V", cancellable = true)
    private static void submitWhiteSolidBlock_791526650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(791526650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2085448248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2085448248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/vehicle/minecart/AbstractMinecart;Lnet/minecraft/client/renderer/entity/state/MinecartRenderState;F)V", cancellable = true)
    private void extractRenderState_1004894261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1004894261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/vehicle/minecart/MinecartTNT;Lnet/minecraft/client/renderer/entity/state/MinecartTntRenderState;F)V", cancellable = true)
    private void extractRenderState__1076169377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1076169377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MinecartTntRenderState;", cancellable = true)
    private void createRenderState_189075647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189075647L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.MinecartTntRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1393763585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393763585L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
