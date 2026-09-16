package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Repairable.class)
public class Repairable492991313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__415634955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415634955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1263414838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263414838L))
            info.setReturnValue("DjO(b *\u132DVD+))VHT\u2382#+\"'@-o_\u2948tH\uD5BD_o|Lp3L(vu`5]rZTa\u3A97\uA241*\u1226. G%x\u1F5B9:h_\u6682#\u9E02s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1050343404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050343404L))
            info.setReturnValue(169232807);
    }

    @Inject(at = @At("HEAD"), method = "items()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void items_2084892837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084892837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidRepairItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isValidRepairItem__1800430437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800430437L))
            info.setReturnValue(false);
    }


}
