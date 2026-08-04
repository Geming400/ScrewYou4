package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.EquipmentAssetManager.class)
public class EquipmentAssetManager_379786819Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/client/resources/model/EquipmentClientInfo;", cancellable = true)
    private void get_760855077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760855077L))
            info.setReturnValue(null);
    }


}
