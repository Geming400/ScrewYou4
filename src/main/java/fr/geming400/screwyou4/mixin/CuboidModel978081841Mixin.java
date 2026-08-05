package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidModel.class)
public class CuboidModel978081841Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parent__1464984712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1464984712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1931373196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931373196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__157378134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157378134L))
            info.setReturnValue("bnS=9on;?竰⡰G_/$>䄠k<弾lujh⊝=_|.iMꨌobHVKVM5q䢍3ᶙ(k歯O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1016344583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016344583L))
            info.setReturnValue(773281938);
    }

    @Inject(at = @At("HEAD"), method = "fromStream(Ljava/io/Reader;)Lnet/minecraft/client/resources/model/cuboid/CuboidModel;", cancellable = true)
    private static void fromStream_702001987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702001987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transforms()Lnet/minecraft/client/resources/model/cuboid/ItemTransforms;", cancellable = true)
    private void transforms_1512314320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512314320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientOcclusion()Ljava/lang/Boolean;", cancellable = true)
    private void ambientOcclusion_1098170849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098170849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiLight()Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private void guiLight__2039446697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039446697L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.FRONT);
    }

    @Inject(at = @At("HEAD"), method = "geometry()Lnet/minecraft/client/resources/model/geometry/UnbakedGeometry;", cancellable = true)
    private void geometry_1071962606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071962606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSlots()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void textureSlots__1384317653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384317653L))
            info.setReturnValue(null);
    }


}
