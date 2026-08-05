package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.TheEndGatewayRenderer.class)
public class TheEndGatewayRenderer1428564207Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1568530845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1568530845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1679201654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679201654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_1466826453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466826453L))
            info.setReturnValue(1509512528);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TheEndPortalBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/EndPortalRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1091680448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1091680448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1849314227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1849314227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_2039248058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2039248058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1732430663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732430663L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;", cancellable = true)
    private void createRenderState_410538138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(410538138L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.EndGatewayRenderState());
    }


}
