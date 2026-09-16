package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty.Type.class)
public class Type2082847561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1174221293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174221293L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1441696210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441696210L))
            info.setReturnValue("\u961E<%Nq2[\u4E4Dgp;VN,v4mBO;\uD010j?\uA29Cs(0joP-*\u2DEEi!/5\u5045:/0m1\u8FF1!L!6>c4\uD01A?NET\uFA63><,;O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1654767644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654767644L))
            info.setReturnValue(-1169061953);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/Codec;)Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private static void create__351871279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351871279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "switchCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void switchCodec_810938979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810938979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCasesFieldCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void createCasesFieldCodec_1708540609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708540609L))
            info.setReturnValue(null);
    }


}
