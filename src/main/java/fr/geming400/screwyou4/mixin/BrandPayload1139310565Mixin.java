package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.custom.BrandPayload.class)
public class BrandPayload1139310565Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", cancellable = true)
    private void type_930507274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930507274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_230684297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230684297L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1909734090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909734090L))
            info.setReturnValue("*h=q`\u213Ak1ZZx`'\uC067,fI+{QX\u93AB\u3D92Q:m%d>Yl\u9535R\uD36EyncP&\"{\uB5BA\u532BqUK'.A7\u7937\u92E2ML 'rp^D\u82F59*\uD44Ft*%\u945Bfgek?-Ah%+)Q}RMJD[>-,2r'\u4216'3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1696662656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696662656L))
            info.setReturnValue(1251094322);
    }

    @Inject(at = @At("HEAD"), method = "brand()Ljava/lang/String;", cancellable = true)
    private void brand_509778869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509778869L))
            info.setReturnValue("}M}eoMqj#3\uBC21\u4E1E/z:ONK`\u3455S7kk N?=q]BugxuI'nZ8F.q ");
    }


}
