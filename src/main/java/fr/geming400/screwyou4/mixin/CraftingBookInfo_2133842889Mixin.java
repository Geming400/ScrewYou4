package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingRecipe.CraftingBookInfo.class)
public class CraftingBookInfo_2133842889Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group_289511568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289511568L))
            info.setReturnValue("^#0!\"aP[c;x\u6B73g|s{*%AV6G\u287DL\u28DBc]vpOK\u37A7Qir\u22BF!?F7o\u8E6D87Q\uD459\u29EEO\uFD20,Q<p@X\u6C3B\u2C1CaHxg(");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1225216620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225216620L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1390700883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390700883L))
            info.setReturnValue("J%M\u6453%SCNc\u3DEC]Sg\u8249Da`\u14E2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1603772317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603772317L))
            info.setReturnValue(981196289);
    }

    @Inject(at = @At("HEAD"), method = "category()Ljava/lang/Object;", cancellable = true)
    private void category__314137695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314137695L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/CraftingBookCategory;", cancellable = true)
    private void category_57931561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57931561L))
            info.setReturnValue(net.minecraft.world.item.crafting.CraftingBookCategory.MISC);
    }


}
