package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimMaterial.class)
public class TrimMaterial_1678550967Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_769924698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769924698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1845992805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845992805L))
            info.setReturnValue("BEf\u41ED\u314A2b0Rk*\uC67FCzG1r\uF919\u4AC1ZMH\u45B94E6-\u697BizXgm,[_RG.\u936Da\u48CBd \u5EDFkf\u6953IzW\uC2FCx\u1DDC7}C&k dbwV !7m'&k|;/z\u3EE5ACNyIcUX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2059064239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059064239L))
            info.setReturnValue(-1084855831);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_1364619589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364619589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assets()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private void assets_1896180656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896180656L))
            info.setReturnValue(null);
    }


}
