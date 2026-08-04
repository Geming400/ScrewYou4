package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SpriteCoordinateExpander.class)
public class SpriteCoordinateExpander65637834Mixin {
        @Inject(at = @At("HEAD"), method = "setColor(I)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setColor_307577637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307577637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setColor(IIII)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setColor_1385904446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385904446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNormal(FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setNormal_1697081608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697081608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv1(II)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv1_1052605534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052605534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv2(II)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv2_1052605534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052605534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLineWidth(F)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setLineWidth__437347768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437347768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addVertex(FFFIFFIIFFF)V", cancellable = true)
    private void addVertex_1552011376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552011376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addVertex(FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void addVertex_1697081608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697081608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setUv(FF)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void setUv__1310170946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310170946L))
            info.setReturnValue(null);
    }


}
