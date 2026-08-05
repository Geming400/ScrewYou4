package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.SwitchCase.class)
public class SwitchCase1645421882Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1264033155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264033155L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_509961907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509961907L))
            info.setReturnValue("2僈r㭽R克tO㽢{$`D?㺼-WS_rkq.s靛苌7.6:z}ꔧaZ4;|vN9G3aQ+gio3όP郒x]-,I^hu3볡-");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1023208598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023208598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1683684624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683684624L))
            info.setReturnValue(-899505432);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model_1772540900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772540900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2129099857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129099857L))
            info.setReturnValue(null);
    }


}
