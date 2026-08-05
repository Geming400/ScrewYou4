package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.MerchantOffer.class)
public class MerchantOffer_864245434Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void copy__757860767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757860767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getResult__1015599376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015599376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "take(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void take_697432339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697432339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItemCostB()Ljava/util/Optional;", cancellable = true)
    private void getItemCostB_1411229811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411229811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemCostA()Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void getItemCostA_742471257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742471257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assemble()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble__1407805777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407805777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/RegistryFriendlyByteBuf;)Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private static void createFromStream__1331271179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331271179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPriceMultiplier()F", cancellable = true)
    private void getPriceMultiplier__1191183320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191183320L))
            info.setReturnValue(6.423341E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateDemand()V", cancellable = true)
    private void updateDemand_1597206904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1597206904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseCostA()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBaseCostA__1402363670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402363670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "needsRestock()Z", cancellable = true)
    private void needsRestock_130578634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130578634L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addToSpecialPriceDiff(I)V", cancellable = true)
    private void addToSpecialPriceDiff_824470646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(824470646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRewardExp()Z", cancellable = true)
    private void shouldRewardExp__604230315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604230315L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetSpecialPriceDiff()V", cancellable = true)
    private void resetSpecialPriceDiff_1380621384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1380621384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "increaseUses()V", cancellable = true)
    private void increaseUses_1550613758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1550613758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUses()I", cancellable = true)
    private void getUses_1169764765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169764765L))
            info.setReturnValue(240169570);
    }

    @Inject(at = @At("HEAD"), method = "getDemand()I", cancellable = true)
    private void getDemand_2096644094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096644094L))
            info.setReturnValue(-132970126);
    }

    @Inject(at = @At("HEAD"), method = "getMaxUses()I", cancellable = true)
    private void getMaxUses_1382587845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382587845L))
            info.setReturnValue(-58013707);
    }

    @Inject(at = @At("HEAD"), method = "getCostB()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCostB__1967458244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967458244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCostA()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCostA__31797957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31797957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXp()I", cancellable = true)
    private void getXp__22875023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22875023L))
            info.setReturnValue(-1291313946);
    }

    @Inject(at = @At("HEAD"), method = "resetUses()V", cancellable = true)
    private void resetUses_1350728849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1350728849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "satisfiedBy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void satisfiedBy__1311318863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311318863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSpecialPriceDiff()I", cancellable = true)
    private void getSpecialPriceDiff__2006821932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006821932L))
            info.setReturnValue(661079079);
    }

    @Inject(at = @At("HEAD"), method = "setSpecialPriceDiff(I)V", cancellable = true)
    private void setSpecialPriceDiff__1368417956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1368417956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setToOutOfStock()V", cancellable = true)
    private void setToOutOfStock_340050814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340050814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOutOfStock()Z", cancellable = true)
    private void isOutOfStock__193647563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193647563L))
            info.setReturnValue(false);
    }


}
