package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Item.class)
public class Item_466284417Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__94009777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94009777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1236707445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236707445L))
            info.setReturnValue("P#*\u869Bt8j\uAE53Y8hw2CNyL\u5330Hu|o>\",<(Tj\u772C[6^\uD20F<a\u0CDD5>>6HS(iEXUH-%G+jN^w");
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/item/Item;)I", cancellable = true)
    private static void getId__321334712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321334712L))
            info.setReturnValue(1573316815);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1951151356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951151356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components__850170953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850170953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/Item;", cancellable = true)
    private static void byId_834043529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834043529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__870832966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870832966L))
            info.setReturnValue("_\uFFAAa#BKoBZx!%Y4r\uA712p_Ms\u7B6F8WQ`TZ0*#w\"RR{Y-58MB\u3DF9`2A}#/#plQbu \uCE2EJ\uCB93:\u9308yt\u6295 `]9E$1=_]N\u01B7#/lc/A!Za/Y");
    }

    @Inject(at = @At("HEAD"), method = "isCorrectToolForDrops(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectToolForDrops_830290328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830290328L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAttackDamageBonus(Lnet/minecraft/world/entity/Entity;FLnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private void getAttackDamageBonus__637639439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637639439L))
            info.setReturnValue(8.51624E7F);
    }

    @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity__577939205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577939205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy__1366818945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1366818945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__990625854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990625854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__2096493273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096493273L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__2036804778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036804778L))
            info.setReturnValue(1234487121);
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void useOnRelease__1937273573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937273573L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed__409111151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-409111151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDestroySpeed(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getDestroySpeed_586139508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586139508L))
            info.setReturnValue(8.51624E7F);
    }

    @Inject(at = @At("HEAD"), method = "isFoil(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFoil__168043482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168043482L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void mineBlock_513189990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513189990L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__448832817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448832817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void asItem_316082049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316082049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_450311401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450311401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/item/Item;", cancellable = true)
    private static void byBlock__353560772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353560772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__437333754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437333754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCraftingRemainder()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getCraftingRemainder_1027805063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027805063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText__1045943424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1045943424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe_1032064662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032064662L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther_194555635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194555635L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void onCraftedBy_794218204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(794218204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void hurtEnemy__97828161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-97828161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick_939351179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939351179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultInstance()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDefaultInstance__495731868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495731868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isBarVisible_1708370899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708370899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarWidth__1368809790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368809790L))
            info.setReturnValue(-655667147);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedPostProcess(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedPostProcess_834255244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(834255244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage__1118775433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118775433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__271530405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271530405L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.EAT);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning_1136942870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136942870L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBarColor(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarColor__1209577019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209577019L))
            info.setReturnValue(-1821656706);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__1848023827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1848023827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getItemDamageSource__927626935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927626935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canDestroyBlock__300910959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300910959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canFitInsideContainerItems()Z", cancellable = true)
    private void canFitInsideContainerItems__1053137893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053137893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultMaxStackSize()I", cancellable = true)
    private void getDefaultMaxStackSize_1745538070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745538070L))
            info.setReturnValue(859961134);
    }


}
