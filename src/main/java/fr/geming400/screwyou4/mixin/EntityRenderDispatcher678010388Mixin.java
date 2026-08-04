package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRenderDispatcher.class)
public class EntityRenderDispatcher678010388Mixin {
        @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/client/Camera;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void prepare__1777110210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777110210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/client/renderer/state/level/CameraRenderState;DDDLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;)V", cancellable = true)
    private void submit_469293690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(469293690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemInHandRenderer()Lnet/minecraft/client/renderer/ItemInHandRenderer;", cancellable = true)
    private void getItemInHandRenderer_66031484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66031484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_777032270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(777032270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractEntity(Lnet/minecraft/world/entity/Entity;F)Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void extractEntity_447356187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447356187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedLightCoords(Lnet/minecraft/world/entity/Entity;F)I", cancellable = true)
    private void getPackedLightCoords__415935177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415935177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerRenderer(Lnet/minecraft/client/player/AbstractClientPlayer;)Lnet/minecraft/client/renderer/entity/player/AvatarRenderer;", cancellable = true)
    private void getPlayerRenderer__823411611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823411611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/entity/Entity;)D", cancellable = true)
    private void distanceToSqr_226268430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226268430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__84710328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84710328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetCamera()V", cancellable = true)
    private void resetCamera_716285127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(716285127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/client/renderer/entity/EntityRenderer;", cancellable = true)
    private void getRenderer_485546523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485546523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/client/renderer/entity/EntityRenderer;", cancellable = true)
    private void getRenderer__1463762265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463762265L))
            info.setReturnValue(null);
    }


}
