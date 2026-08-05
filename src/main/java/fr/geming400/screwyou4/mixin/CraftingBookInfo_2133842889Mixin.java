package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingRecipe.CraftingBookInfo.class)
public class CraftingBookInfo_2133842889Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group_998382417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998382417L))
            info.setReturnValue("**AॳJ/:sjfAtFCks]_㘝p-鋡ↃG7G_M)17`&n⽬B+Yi{[j덒7>-|y(1,zi&S3|kτ23 TT差n]g6TogUa84?5R.q>G+Fx窩궾RDDm暊M!er");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__775612149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775612149L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_998382913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998382913L))
            info.setReturnValue("o]p攡Ab$&ta[|ta$cD<4S䇿嫘{CH.YS_^#1KF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2122861666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122861666L))
            info.setReturnValue(-1842900561);
    }

    @Inject(at = @At("HEAD"), method = "category()Ljava/lang/Object;", cancellable = true)
    private void category__301803229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301803229L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private void category__589432021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589432021L))
            info.setReturnValue(net.minecraft.world.item.crafting.CraftingBookCategory.MISC);
    }


}
