package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.ParamInfo.class)
public class ParamInfo_1578945155Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1906754986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906754986L))
            info.setReturnValue("wJi,#oc,:\u6EBE]B\uD0C0^Ax\u6482IEU'<\uC794%]ds#v2jzpwTjCJ?.{\uC2B4D [\u75EAbe>fs;Q%].raAa\uA869wKd2");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_670318886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670318886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1945598617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945598617L))
            info.setReturnValue(",d\uC8AFiJR\"#aMATG\u24BE\u458AN^+Gi ^,V.\u11E1d>\uD69Dr)\u92104-|\uBB102 e7O:U]TzBSofV}\u9689#$\uC299[%X$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2136297245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136297245L))
            info.setReturnValue(-1788187109);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void typedCodec_1403529930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403529930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required__1708580870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708580870L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__1695162235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695162235L))
            info.setReturnValue(null);
    }


}
