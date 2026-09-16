package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.witch.WitchModel.class)
public class WitchModel33259606Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_429652261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429652261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms__2037883196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037883196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_747797044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747797044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1870395003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1870395003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_716908151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(716908151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;)V", cancellable = true)
    private void setupAnim__969238612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-969238612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNose()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getNose_1358339794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1358339794L))
            info.setReturnValue(null);
    }


}
