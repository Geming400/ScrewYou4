package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.trading.MerchantOffer.class)
public class MerchantOffer_864245434Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private void copy_1115400044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115400044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getResult_1387664093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387664093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "take(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void take_2109841978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109841978L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getXp()I", cancellable = true)
    private void getXp_902507679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902507679L))
            info.setReturnValue(-1724014438);
    }

    @Inject(at = @At("HEAD"), method = "resetUses()V", cancellable = true)
    private void resetUses_902520172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902520172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateDemand()V", cancellable = true)
    private void updateDemand_902520172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902520172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "needsRestock()Z", cancellable = true)
    private void needsRestock_902524016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902524016L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPriceMultiplier()F", cancellable = true)
    private void getPriceMultiplier_902504796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902504796L))
            info.setReturnValue(6.78823E7F);
    }

    @Inject(at = @At("HEAD"), method = "addToSpecialPriceDiff(I)V", cancellable = true)
    private void addToSpecialPriceDiff_2078162405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078162405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseCostA()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBaseCostA_1387664093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387664093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRewardExp()Z", cancellable = true)
    private void shouldRewardExp_902524016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902524016L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetSpecialPriceDiff()V", cancellable = true)
    private void resetSpecialPriceDiff_902520172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902520172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromStream(Lnet/minecraft/network/RegistryFriendlyByteBuf;)Lnet/minecraft/world/item/trading/MerchantOffer;", cancellable = true)
    private static void createFromStream_65966491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(65966491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSpecialPriceDiff(I)V", cancellable = true)
    private void setSpecialPriceDiff_2078162405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078162405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpecialPriceDiff()I", cancellable = true)
    private void getSpecialPriceDiff_902507679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902507679L))
            info.setReturnValue(-1724014438);
    }

    @Inject(at = @At("HEAD"), method = "setToOutOfStock()V", cancellable = true)
    private void setToOutOfStock_902520172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902520172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "satisfiedBy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void satisfiedBy_2109841978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109841978L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "assemble()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void assemble_1387664093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387664093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemCostB()Ljava/util/Optional;", cancellable = true)
    private void getItemCostB_1109706855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109706855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemCostA()Lnet/minecraft/world/item/trading/ItemCost;", cancellable = true)
    private void getItemCostA_32376260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32376260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "increaseUses()V", cancellable = true)
    private void increaseUses_902520172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902520172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCostA()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCostA_1387664093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387664093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCostB()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCostB_1387664093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387664093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOutOfStock()Z", cancellable = true)
    private void isOutOfStock_902524016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902524016L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxUses()I", cancellable = true)
    private void getMaxUses_902507679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902507679L))
            info.setReturnValue(-1724014438);
    }

    @Inject(at = @At("HEAD"), method = "getDemand()I", cancellable = true)
    private void getDemand_902507679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902507679L))
            info.setReturnValue(-1724014438);
    }

    @Inject(at = @At("HEAD"), method = "getUses()I", cancellable = true)
    private void getUses_902507679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902507679L))
            info.setReturnValue(-1724014438);
    }


}
