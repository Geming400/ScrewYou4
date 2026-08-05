package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.AbstractCookingRecipe.CookingBookInfo.class)
public class CookingBookInfo574893949Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group__1269437371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269437371L))
            info.setReturnValue("r_\uAB56Jnr-lS\u7F0DThP#Xv |#vjE5T?[\u0E24PrGL{l[:xpA>_%)_zyu\u2D80\uC31ADdwd\u2CC8\u9811hT.MO%ym\u00A5j\u7EBEz");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__333732319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333732319L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1345317474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345317474L))
            info.setReturnValue("y*%\u6FCB\uD6FB!/wWi@NDO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1132246040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132246040L))
            info.setReturnValue(408939808);
    }

    @Inject(at = @At("HEAD"), method = "category()Ljava/lang/Object;", cancellable = true)
    private void category__1873086634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873086634L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/CookingBookCategory;", cancellable = true)
    private void category_379753476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379753476L))
            info.setReturnValue(net.minecraft.world.item.crafting.CookingBookCategory.FOOD);
    }


}
