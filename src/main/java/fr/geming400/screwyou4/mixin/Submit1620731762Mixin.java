package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.ShapeOutlineFeatureRenderer.Submit.class)
public class Submit1620731762Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1288723275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1288723275L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_485271787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485271787L))
            info.setReturnValue("\u9A25ol4T\u5B4AhQ+w%zeW&CY\u0418#d9f{TRAE635()e25<g\u74CCY^[$<>=ZwUt1h%e5^^\u69E8G\u254B}:q?:ji%D?ZY:BJ@dS0B#79Z`(\u08F3TvV/e]\uB5F3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1658994504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658994504L))
            info.setReturnValue(-701880591);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1658994008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658994008L))
            info.setReturnValue(-498733172);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_1658991125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658991125L))
            info.setReturnValue(8.229011E8F);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shape__260938156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260938156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType__1643152008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643152008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lcom/mojang/blaze3d/vertex/PoseStack$Pose;", cancellable = true)
    private void pose__468588638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468588638L))
            info.setReturnValue(new com.mojang.blaze3d.vertex.PoseStack.Pose());
    }

    @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__1589655837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589655837L))
            info.setReturnValue(null);
    }


}
