package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TntMinecartRenderer.class)
public class TntMinecartRenderer_1982400030Mixin {
        @Inject(at = @At("HEAD"), method = "submitWhiteSolidBlock(Lnet/minecraft/client/renderer/block/BlockModelRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IZI)V", cancellable = true)
    private static void submitWhiteSolidBlock_452087463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(452087463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1420178222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1420178222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/vehicle/minecart/AbstractMinecart;Lnet/minecraft/client/renderer/entity/state/MinecartRenderState;F)V", cancellable = true)
    private void extractRenderState_2111790223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2111790223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/vehicle/minecart/MinecartTNT;Lnet/minecraft/client/renderer/entity/state/MinecartTntRenderState;F)V", cancellable = true)
    private void extractRenderState_332802105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(332802105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/MinecartTntRenderState;", cancellable = true)
    private void createRenderState__2008864288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008864288L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.MinecartTntRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2059396288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059396288L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
