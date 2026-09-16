package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.EnchantmentDefinition.class)
public class EnchantmentDefinition_1676548985Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_767922716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767922716L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1847994787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847994787L))
            info.setReturnValue("\uA9D4zmnA&z\u9209w:!,&k(&XB*0\u6AE2Xk\"qV I|i\u25C3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2061066221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061066221L))
            info.setReturnValue(1486316485);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/List;", cancellable = true)
    private void slots_1074344797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074344797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight__593266202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593266202L))
            info.setReturnValue(-344623479);
    }

    @Inject(at = @At("HEAD"), method = "maxLevel()I", cancellable = true)
    private void maxLevel_658242782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658242782L))
            info.setReturnValue(-966013761);
    }

    @Inject(at = @At("HEAD"), method = "anvilCost()I", cancellable = true)
    private void anvilCost__2044613051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2044613051L))
            info.setReturnValue(946849347);
    }

    @Inject(at = @At("HEAD"), method = "maxCost()Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private void maxCost__667686994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-667686994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minCost()Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private void minCost_1449492736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449492736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryItems()Ljava/util/Optional;", cancellable = true)
    private void primaryItems__1411076604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411076604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportedItems()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void supportedItems__1936518082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936518082L))
            info.setReturnValue(null);
    }


}
