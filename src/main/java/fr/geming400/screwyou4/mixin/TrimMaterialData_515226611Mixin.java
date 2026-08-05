package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ItemModelGenerators.TrimMaterialData.class)
public class TrimMaterialData_515226611Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1900738869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900738869L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__620233365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620233365L))
            info.setReturnValue("\"$J\u2852\uB4D0\"g\u2151]DW\u7FD7Y\uB322kn`1v\u9B19l\u2D1FK,\uD22Bh,P>Sa\u9434|qPv\u3E3C<W^\u22B9</xB^wM}Sr^;j[\u2C1F?'9+\u0BB7{V\u5C6Bg3%s!(h0\u1EDFEiEcfjgxz!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_553489352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553489352L))
            info.setReturnValue(371690441);
    }

    @Inject(at = @At("HEAD"), method = "assets()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private void assets_867935337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867935337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void materialKey_1323717923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323717923L))
            info.setReturnValue(null);
    }


}
