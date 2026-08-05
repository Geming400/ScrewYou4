package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidModel.class)
public class CuboidModel978081841Mixin {
        @Inject(at = @At("HEAD"), method = "parent()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void parent__1978813918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978813918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_69455573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69455573L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1748505366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748505366L))
            info.setReturnValue(" cx\u37FCD_pONMnpfb\u7DF4\u9731Og:$`vjr[\u085A%M\u3F61V}Ulk.Fgs\uB753x*Z`7 \u5E1Ar:\u99B4f{^\u1DDCGm`9 p'L;O?U77)pkqk\uCBD8,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1535433932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535433932L))
            info.setReturnValue(-1762058531);
    }

    @Inject(at = @At("HEAD"), method = "fromStream(Ljava/io/Reader;)Lnet/minecraft/client/resources/model/cuboid/CuboidModel;", cancellable = true)
    private static void fromStream__178286663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178286663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transforms()Lnet/minecraft/client/resources/model/cuboid/ItemTransforms;", cancellable = true)
    private void transforms_2048614487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048614487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientOcclusion()Ljava/lang/Boolean;", cancellable = true)
    private void ambientOcclusion__466746260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466746260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSlots()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void textureSlots_1706999057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706999057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "geometry()Lnet/minecraft/client/resources/model/geometry/UnbakedGeometry;", cancellable = true)
    private void geometry_230306876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230306876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiLight()Lnet/minecraft/client/resources/model/UnbakedModel$GuiLight;", cancellable = true)
    private void guiLight__1346540558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346540558L))
            info.setReturnValue(net.minecraft.client.resources.model.UnbakedModel.GuiLight.SIDE);
    }


}
