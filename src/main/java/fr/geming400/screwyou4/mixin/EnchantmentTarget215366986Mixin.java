package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentTarget.class)
public class EnchantmentTarget215366986Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private static void values__759576510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759576510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private static void valueOf__1819749687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819749687L))
            info.setReturnValue(net.minecraft.world.item.enchantment.EnchantmentTarget.VICTIM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_303575608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303575608L))
            info.setReturnValue("\u438D\u050D,*A-7\uCCE6\u75AA\u6AB3\u5293\u8F4FGw!hk;!<%BdHQ! U9ODZ'8yFm%z\">)`l$[,w5\u071AuoV5l8%bGla,\uBD71q_@H]06p2O\u6AE2EXJ9I;rq:rqoI.\u12DD\"");
    }


}
