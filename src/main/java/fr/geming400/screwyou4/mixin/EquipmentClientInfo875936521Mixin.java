package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.class)
public class EquipmentClientInfo875936521Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2033518516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033518516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__259523454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259523454L))
            info.setReturnValue("6VT=p)A-.>*f2n]0LJRvv\u09756b5Gd,\u5423G`Q#A\uCB3Fo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_914199263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914199263L))
            info.setReturnValue(1564678538);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private static void builder_934207409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934207409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layers()Ljava/util/Map;", cancellable = true)
    private void layers__1128687119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128687119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;)Ljava/util/List;", cancellable = true)
    private void getLayers_538774392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538774392L))
            info.setReturnValue(null);
    }


}
