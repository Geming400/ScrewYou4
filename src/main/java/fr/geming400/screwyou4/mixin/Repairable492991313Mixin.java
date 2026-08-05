package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Repairable.class)
public class Repairable492991313Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1878503572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878503572L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__642468662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642468662L))
            info.setReturnValue("᧤<{]䀰Wꌴ7A셊0QPÍ⦼ ht4TYuꓢWxeL3mn@@Z↼930:]/)#-纞gg3퐀0uccF48`|桦fEZ'nk9{_6S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_531254055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531254055L))
            info.setReturnValue(840197688);
    }

    @Inject(at = @At("HEAD"), method = "items()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void items_2112944357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112944357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidRepairItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isValidRepairItem__2067440851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067440851L))
            info.setReturnValue(true);
    }


}
