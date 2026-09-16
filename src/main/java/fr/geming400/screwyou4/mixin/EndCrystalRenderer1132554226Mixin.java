package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EndCrystalRenderer.class)
public class EndCrystalRenderer1132554226Mixin {
        @Inject(at = @At("HEAD"), method = "getY(F)F", cancellable = true)
    private static void getY__900658426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900658426L))
            info.setReturnValue(4.806434E8F);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__446110234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-446110234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_55061406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(55061406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__1299397169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299397169L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__953753379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953753379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_570332419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(570332419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;F)V", cancellable = true)
    private void extractRenderState__479170369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-479170369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1385725205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385725205L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;", cancellable = true)
    private void createRenderState__1191877555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191877555L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EndCrystalRenderState());
    }


}
