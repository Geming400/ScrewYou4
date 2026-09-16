package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.TheEndGatewayRenderer.class)
public class TheEndGatewayRenderer1428564207Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1225120693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1225120693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1357761906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357761906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__921192409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-921192409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TheEndGatewayBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__360349292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360349292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TheEndPortalBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/EndPortalRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1924936730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1924936730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__668183387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668183387L))
            info.setReturnValue(-1741407413);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1811327032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811327032L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/EndGatewayRenderState;", cancellable = true)
    private void createRenderState_1217589563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217589563L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.EndGatewayRenderState());
    }


}
