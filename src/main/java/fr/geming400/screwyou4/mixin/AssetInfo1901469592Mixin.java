package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.MaterialAssetGroup.AssetInfo.class)
public class AssetInfo1901469592Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_992843324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992843324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1623074179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623074179L))
            info.setReturnValue("Cfhuy1gIA0{CPQy0w!N7P\uD345\u91728H`Eew\u24A2!\u9EDE&X#R4+!O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1836145613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836145613L))
            info.setReturnValue(-686636418);
    }

    @Inject(at = @At("HEAD"), method = "suffix()Ljava/lang/String;", cancellable = true)
    private void suffix_424973234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424973234L))
            info.setReturnValue("cqByuIl2C$XVRa\u2D47\u8F79\u1B6F>Ofj1U!\u4162H2(Nb|M&R|PQF3RCcq..j,m98uq\u44BC<)\uB998ugM8^xVE\uFCA3");
    }


}
