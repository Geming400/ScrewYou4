package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.LayerType.class)
public class LayerType1578767288Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;", cancellable = true)
    private static void values_2091950345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091950345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;", cancellable = true)
    private static void valueOf__1404071674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404071674L))
            info.setReturnValue(net.minecraft.client.resources.model.EquipmentClientInfo.LayerType.CAMEL_SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_443306817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443306817L))
            info.setReturnValue("n,AU)+&a\uC252&Dc-ZTXHuH,P`:kqJ<,yZZ\u3B86v+^+Otz#\u5588!\u708F!_*1");
    }

    @Inject(at = @At("HEAD"), method = "trimAssetPrefix()Ljava/lang/String;", cancellable = true)
    private void trimAssetPrefix_443306817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443306817L))
            info.setReturnValue("n,AU)+&a\uC252&Dc-ZTXHuH,P`:kqJ<,yZZ\u3B86v+^+Otz#\u5588!\u708F!_*1");
    }


}
