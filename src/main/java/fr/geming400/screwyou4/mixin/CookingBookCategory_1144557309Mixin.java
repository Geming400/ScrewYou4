package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CookingBookCategory.class)
public class CookingBookCategory_1144557309Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private static void values__1815417342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815417342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private static void valueOf__2126711141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126711141L))
            info.setReturnValue(net.minecraft.world.item.crafting.CookingBookCategory.FOOD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1232765930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232765930L))
            info.setReturnValue("r9\u51AC(V&uOtXH\"zt\uA2FFIc|;T#\u11E9W\u0915*\u29A75mU4]\u89A7'\u54D67xXZa\uFC20f5<nP/V\u0CD6");
    }


}
