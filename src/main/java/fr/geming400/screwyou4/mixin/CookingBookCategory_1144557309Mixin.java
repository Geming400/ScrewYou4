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
            info.setReturnValue("G\u4BC83;R9`\u3BC2%t*cLpFZXK\u67C49&QK8O!A;f\u70EA+N%\"\u4EEDZpa!E\"\u6782\u16E3CszSl\u7968b-C9\uAA44t\u6316?8+f\u30B8\uBDDB}LiLUB.BbS\u4BD6][F`rh3qUS\u52E0D.B/");
    }


}
