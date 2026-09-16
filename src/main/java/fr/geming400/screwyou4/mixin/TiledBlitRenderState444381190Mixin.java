package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.TiledBlitRenderState.class)
public class TiledBlitRenderState444381190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__464245078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464245078L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1214804715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1214804715L))
            info.setReturnValue("PUF=a\uAB2A1wV\uC443\u4E7Fb");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1001733281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001733281L))
            info.setReturnValue(375812141);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1__763279090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763279090L))
            info.setReturnValue(6.589282E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__2022551159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022551159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1011731155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011731155L))
            info.setReturnValue(75285058);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1681032297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681032297L))
            info.setReturnValue(1471193783);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1899234836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899234836L))
            info.setReturnValue(-693892904);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1__1650782771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650782771L))
            info.setReturnValue(6.589282E8F);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0__791908241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791908241L))
            info.setReturnValue(6.589282E8F);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0__1679411922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679411922L))
            info.setReturnValue(6.589282E8F);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_983102004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983102004L))
            info.setReturnValue(527299080);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1870605685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870605685L))
            info.setReturnValue(487841997);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2f;", cancellable = true)
    private void pose__1913491937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913491937L))
            info.setReturnValue(new org.joml.Matrix3x2f());
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__2080519115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080519115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_945015239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945015239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tileWidth()I", cancellable = true)
    private void tileWidth_1492465972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492465972L))
            info.setReturnValue(-1939743230);
    }

    @Inject(at = @At("HEAD"), method = "tileHeight()I", cancellable = true)
    private void tileHeight_1089870231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089870231L))
            info.setReturnValue(1618463801);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1457908612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457908612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_803748767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803748767L))
            info.setReturnValue(null);
    }


}
