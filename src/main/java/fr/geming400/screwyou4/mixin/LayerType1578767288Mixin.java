package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.LayerType.class)
public class LayerType1578767288Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;", cancellable = true)
    private static void values_322222631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322222631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;", cancellable = true)
    private static void valueOf__86166994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86166994L))
            info.setReturnValue(net.minecraft.client.resources.model.EquipmentClientInfo.LayerType.HUMANOID_BABY);
    }

    @Inject(at = @At("HEAD"), method = "trimAssetPrefix()Ljava/lang/String;", cancellable = true)
    private void trimAssetPrefix__810501279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810501279L))
            info.setReturnValue("\"f*(\uFC2C\uABEBrW\uB1A5%v8H4!eey-h\u4969aam\u4AB6\uC7B85?I\u6A9E\u518AbB\u7D64");
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1666975910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666975910L))
            info.setReturnValue("\u5AD2>,\"oN\u2AEEz;yC`KOGq");
    }


}
