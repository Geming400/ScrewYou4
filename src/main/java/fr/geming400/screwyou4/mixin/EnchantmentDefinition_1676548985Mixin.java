package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantment.EnchantmentDefinition.class)
public class EnchantmentDefinition_1676548985Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1232906053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232906053L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_541089009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541089009L))
            info.setReturnValue("x)s}LN)Dnx7N6=\u86DEmKZ'dz0YC!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1714811726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714811726L))
            info.setReturnValue(1130513443);
    }

    @Inject(at = @At("HEAD"), method = "slots()Ljava/util/List;", cancellable = true)
    private void slots__992081496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992081496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxLevel()I", cancellable = true)
    private void maxLevel_1714811230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714811230L))
            info.setReturnValue(1333660862);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight_1714811230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714811230L))
            info.setReturnValue(1333660862);
    }

    @Inject(at = @At("HEAD"), method = "maxCost()Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private void maxCost_1824482719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824482719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anvilCost()I", cancellable = true)
    private void anvilCost_1714811230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714811230L))
            info.setReturnValue(1333660862);
    }

    @Inject(at = @At("HEAD"), method = "minCost()Lnet/minecraft/world/item/enchantment/Enchantment$Cost;", cancellable = true)
    private void minCost_1824482719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824482719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "supportedItems()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void supportedItems__998465268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998465268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primaryItems()Ljava/util/Optional;", cancellable = true)
    private void primaryItems_1922010406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1922010406L))
            info.setReturnValue(null);
    }


}
