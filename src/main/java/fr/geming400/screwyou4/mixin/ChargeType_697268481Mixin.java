package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.ChargeType.class)
public class ChargeType_697268481Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private static void values__1202655629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202655629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private static void valueOf_1505765946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1505765946L))
            info.setReturnValue(net.minecraft.world.item.CrossbowItem.ChargeType.ARROW);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_785477102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785477102L))
            info.setReturnValue("j\u6228AG-n\u40C9WB`A[bv[=$,m,AD w\uD76Auypj?Qlti");
    }


}
