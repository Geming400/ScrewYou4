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
            info.setReturnValue("2\u50C8r\u3B7DR\u514BtO\u3F62{$`D?\u3EBC-WS_rkq.s\u975B\u82CC7.6:z}\uA527aZ4;|vN9G3aQ+gio3\u03CCP\u90D2x]-,I^hu3\uBCE1-");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1023208598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023208598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1683684624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683684624L))
            info.setReturnValue(-553110232);
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
