package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ToolMaterial.class)
public class ToolMaterial2127786075Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__781668962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781668962L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_992326100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(992326100L))
            info.setReturnValue("T3/X\u82BC&Z\u86DCzVkm4pc5ne\uBEEB*\u9E36\uFB2C|nbc%\u3BF5wpMhKvE:G78Ms8\u0AE7Kl4CMq;\uC12E?WH/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2128918479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128918479L))
            info.setReturnValue(-1152132173);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed__2128921858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128921858L))
            info.setReturnValue(5.733058E8F);
    }

    @Inject(at = @At("HEAD"), method = "durability()I", cancellable = true)
    private void durability__2128918975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128918975L))
            info.setReturnValue(1745427118);
    }

    @Inject(at = @At("HEAD"), method = "incorrectBlocksForDrops()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void incorrectBlocksForDrops__1319847176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319847176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantmentValue()I", cancellable = true)
    private void enchantmentValue__2128918975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128918975L))
            info.setReturnValue(1745427118);
    }

    @Inject(at = @At("HEAD"), method = "applyToolProperties(Lnet/minecraft/world/item/Item$Properties;Lnet/minecraft/tags/TagKey;FFF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void applyToolProperties_459401940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459401940L))
            info.setReturnValue(new net.minecraft.world.item.Item$Properties());
    }

    @Inject(at = @At("HEAD"), method = "repairItems()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void repairItems__1319847176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319847176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackDamageBonus()F", cancellable = true)
    private void attackDamageBonus__2128921858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128921858L))
            info.setReturnValue(5.733058E8F);
    }

    @Inject(at = @At("HEAD"), method = "applySwordProperties(Lnet/minecraft/world/item/Item$Properties;FF)Lnet/minecraft/world/item/Item$Properties;", cancellable = true)
    private void applySwordProperties_1444077402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444077402L))
            info.setReturnValue(new net.minecraft.world.item.Item$Properties());
    }


}
