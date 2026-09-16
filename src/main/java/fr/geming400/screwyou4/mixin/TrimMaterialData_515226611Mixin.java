package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ItemModelGenerators.TrimMaterialData.class)
public class TrimMaterialData_515226611Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__393399658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393399658L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1285650135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285650135L))
            info.setReturnValue("t\uB1C4#4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1072578701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072578701L))
            info.setReturnValue(1691006178);
    }

    @Inject(at = @At("HEAD"), method = "assets()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private void assets_732856300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732856300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void materialKey_945653867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945653867L))
            info.setReturnValue(null);
    }


}
