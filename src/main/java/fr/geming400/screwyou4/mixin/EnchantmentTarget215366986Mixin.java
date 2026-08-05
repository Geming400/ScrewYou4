package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentTarget.class)
public class EnchantmentTarget215366986Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private static void values_213873188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213873188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/enchantment/EnchantmentTarget;", cancellable = true)
    private static void valueOf__1657752159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657752159L))
            info.setReturnValue(net.minecraft.world.item.enchantment.EnchantmentTarget.DAMAGING_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__920093485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-920093485L))
            info.setReturnValue("xQQWN)Y|$\u87C1Z9x<)FNft\u5453R!\u4A54R3VTjUnz;>\u9292UiI1;>wW{Bi\u7A0AJ!\u7F71VG*5GR8utjw:xyX'@5Lc\u3D0CdT}aVkq\u8D9592%'t1vwGw\u8893\u5C7AX\u8212:tn");
    }


}
