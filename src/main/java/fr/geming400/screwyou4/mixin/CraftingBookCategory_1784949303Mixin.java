package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingBookCategory.class)
public class CraftingBookCategory_1784949303Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private static void values__101483032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-101483032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private static void valueOf__1161656209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161656209L))
            info.setReturnValue(net.minecraft.world.item.crafting.CraftingBookCategory.EQUIPMENT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1873157924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873157924L))
            info.setReturnValue("\uFC03#}o\u5C08IWqGKJC\u930C2/\uA35D\uC91FeY-!#Y37{Q`+\u750CNIj\uBFBBNQ_gmU6:g");
    }


}
