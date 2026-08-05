package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CookingBookCategory.class)
public class CookingBookCategory_1144557309Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private static void values_1264025568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264025568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private static void valueOf__736012093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736012093L))
            info.setReturnValue(net.minecraft.world.item.crafting.CookingBookCategory.MISC);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_9096837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9096837L))
            info.setReturnValue("G䯈3;R9`㯂%t*cLpFZXK柄9&QK8O!A;f烪+N%\"仭Zpa!E\"枂ᛣCszSl票b-C9ꩄt挖?8+fジ뷛}LiLUB.BbS䯖][F`rh3qUS勠D.B/");
    }


}
