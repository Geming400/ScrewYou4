package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.EnchantmentInstance.class)
public class EnchantmentInstance1143264910Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_234638642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234638642L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1913688435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913688435L))
            info.setReturnValue(" N&yGhmS\uBC20_DEd8\u6567nTypEfq\u9416jr@\uCDA9fJq%pKFfC|*=1ejL\u04F5E%\u27F77km\u4604nodo`D_nrg,UzY\u7756!\u76A4\u23E9\uBD97@?\u64BEc.%&}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1700617001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700617001L))
            info.setReturnValue(309089540);
    }

    @Inject(at = @At("HEAD"), method = "level()I", cancellable = true)
    private void level_1297326960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297326960L))
            info.setReturnValue(2113660128);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight__1126550276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126550276L))
            info.setReturnValue(819738061);
    }

    @Inject(at = @At("HEAD"), method = "enchantment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void enchantment_10574451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10574451L))
            info.setReturnValue(null);
    }


}
