package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EntityRenderDispatcher.class)
public class EntityRenderDispatcher678010388Mixin {
        @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/client/Camera;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void prepare__2610537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2610537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/client/renderer/state/level/CameraRenderState;DDDLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;)V", cancellable = true)
    private void submit_2031848290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2031848290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractEntity(Lnet/minecraft/world/entity/Entity;F)Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void extractEntity__2107207201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107207201L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "resetCamera()V", cancellable = true)
    private void resetCamera__155286541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-155286541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemInHandRenderer()Lnet/minecraft/client/renderer/ItemInHandRenderer;", cancellable = true)
    private void getItemInHandRenderer__469814404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469814404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__1754069967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754069967L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/entity/Entity;)D", cancellable = true)
    private void distanceToSqr__1716291726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716291726L))
            info.setReturnValue(5.498457003564135E8D);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_931254549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(931254549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/client/renderer/entity/EntityRenderer;", cancellable = true)
    private void getRenderer__679808812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679808812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/client/renderer/entity/EntityRenderer;", cancellable = true)
    private void getRenderer__1515765682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515765682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedLightCoords(Lnet/minecraft/world/entity/Entity;F)I", cancellable = true)
    private void getPackedLightCoords__909762703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909762703L))
            info.setReturnValue(1279418799);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerRenderer(Lnet/minecraft/client/player/AbstractClientPlayer;)Lnet/minecraft/client/renderer/entity/player/AvatarRenderer;", cancellable = true)
    private void getPlayerRenderer_804873631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804873631L))
            info.setReturnValue(null);
    }


}
