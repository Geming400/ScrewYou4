package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Builder.class)
public class Builder_1468567528Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/EquipmentClientInfo;", cancellable = true)
    private void build__576169010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-576169010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addHumanoidLayers(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addHumanoidLayers__2021658795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021658795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addHumanoidLayers(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addHumanoidLayers__888084465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888084465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMainHumanoidLayer(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addMainHumanoidLayer__2021658795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021658795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;[Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addLayers__981579534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981579534L))
            info.setReturnValue(null);
    }


}
