package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentClientInfo.Builder.class)
public class Builder_1468567528Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/EquipmentClientInfo;", cancellable = true)
    private void build__570919492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570919492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addMainHumanoidLayer(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addMainHumanoidLayer_1053516059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053516059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addHumanoidLayers(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addHumanoidLayers__1696864209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696864209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addHumanoidLayers(Lnet/minecraft/resources/Identifier;Z)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addHumanoidLayers__1324027083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324027083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;[Lnet/minecraft/client/resources/model/EquipmentClientInfo$Layer;)Lnet/minecraft/client/resources/model/EquipmentClientInfo$Builder;", cancellable = true)
    private void addLayers_907656143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907656143L))
            info.setReturnValue(null);
    }


}
