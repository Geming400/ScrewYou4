package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.SelectItemModel.SwitchCase.class)
public class SwitchCase1645421882Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_736795614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736795614L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1879121889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879121889L))
            info.setReturnValue("\u3E4Ci,+\u706Ay\uCFC2@V\u59FBc\"m>Y(\uAC3D\u3937?f\"rU=OM\uB698qdv\uF9EC,\uFD40mJ}AYzw9&'3\uCCE8S? k\uAA7Fh\u6A7C%eAdG}G");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1471624308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471624308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2092193323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092193323L))
            info.setReturnValue(-209415100);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private void model__1493640755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493640755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1997070695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997070695L))
            info.setReturnValue(null);
    }


}
