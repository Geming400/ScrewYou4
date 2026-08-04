package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.SpawnerRenderer.class)
public class SpawnerRenderer_1439471971Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/SpawnerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1301702344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1301702344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1579438608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579438608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1721522900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721522900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/SpawnerRenderState;", cancellable = true)
    private void createRenderState_231819268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231819268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1838406464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838406464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/SpawnerBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/SpawnerRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1097296972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1097296972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitEntityInSpawner(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;FFLnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private static void submitEntityInSpawner_326591697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(326591697L))
            info.cancel();
    }


}
