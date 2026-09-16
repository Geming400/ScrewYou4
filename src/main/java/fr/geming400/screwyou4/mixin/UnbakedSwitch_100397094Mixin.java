package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.UnbakedSwitch.class)
public class UnbakedSwitch_100397094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__808229175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808229175L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_870820618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870820618L))
            info.setReturnValue("\u4F1B__2VcL2\uBB47V\uB4B5,)A{Q=@ax(PXk+ToIx;?Y\u0BF9ln\u3890#bs-KH&qa\"I\u4891lJ\uB764?rw\u557ChK\u92E5\u68D8L t\uA7AABQ{$I&t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_657749184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657749184L))
            info.setReturnValue(-1723692291);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/block/model/properties/select/SelectBlockModelProperty;", cancellable = true)
    private void property__1977920000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977920000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cases()Ljava/util/List;", cancellable = true)
    private void cases_301042200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301042200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;Lnet/minecraft/client/renderer/block/model/BlockModel;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake_80923140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80923140L))
            info.setReturnValue(null);
    }


}
