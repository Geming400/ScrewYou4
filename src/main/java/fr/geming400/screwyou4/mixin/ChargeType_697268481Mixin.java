package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CrossbowItem.ChargeType.class)
public class ChargeType_697268481Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private static void values__1429460523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429460523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private static void valueOf_744558354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744558354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__438191991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438191991L))
            info.setReturnValue(null);
    }


}
