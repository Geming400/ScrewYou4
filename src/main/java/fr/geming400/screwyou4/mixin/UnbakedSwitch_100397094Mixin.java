package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.UnbakedSwitch.class)
public class UnbakedSwitch_100397094Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1485909352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485909352L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1035062882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035062882L))
            info.setReturnValue("X9]쐳\"iDB=W<O谮tz&%U,Yea/OzWhhtqssacp\"E@Y{[fcu2K&j#WY뻼69]2R.3Ekn뱕/jj`_nh\"4u!f貕;P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_138659835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138659835L))
            info.setReturnValue(-1282121498);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/block/model/properties/select/SelectBlockModelProperty;", cancellable = true)
    private void property__1441009557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441009557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cases()Ljava/util/List;", cancellable = true)
    private void cases_1726733909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726733909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;Lnet/minecraft/client/renderer/block/model/BlockModel;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__764312277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764312277L))
            info.setReturnValue(null);
    }


}
