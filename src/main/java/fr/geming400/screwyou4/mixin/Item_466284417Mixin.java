package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.Item.class)
public class Item_466284417Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_312148238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312148238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__669176055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669176055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Lnet/minecraft/world/item/Item;)I", cancellable = true)
    private static void getId_1997155255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997155255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_876660451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876660451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void components_1670089357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670089357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFoil(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isFoil__2094147748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094147748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder__722061611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722061611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__1520675436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1520675436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canDestroyBlock_1775967918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775967918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures_1131105410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131105410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultMaxStackSize()I", cancellable = true)
    private void getDefaultMaxStackSize_504546662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504546662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDestroySpeed(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getDestroySpeed_524244023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524244023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCorrectToolForDrops(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectToolForDrops_524263243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(524263243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity_978366589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978366589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttackDamageBonus(Lnet/minecraft/world/entity/Entity;FLnet/minecraft/world/damagesource/DamageSource;)F", cancellable = true)
    private void getAttackDamageBonus_2125485343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125485343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy_788498200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788498200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1026115950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026115950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1442558839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442558839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/Item;", cancellable = true)
    private static void byId_1756242871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756242871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void asItem__52651002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52651002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarColor(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarColor__2094164085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094164085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isBarVisible__2094147748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094147748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarWidth__2094164085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094164085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage__1487910167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487910167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void hurtEnemy_788498200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788498200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick__222901210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-222901210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId__669175559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669175559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther__425298883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425298883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe_324218032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324218032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__768708514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768708514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__430896239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430896239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void useOnRelease__2094147748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094147748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void releaseUsing__1367344918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367344918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void mineBlock_1881260780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881260780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultInstance()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDefaultInstance_989703076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989703076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/world/item/Item;", cancellable = true)
    private static void byBlock_755694662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755694662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed_27315531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(27315531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBy(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void onCraftedBy__2017151853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2017151853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canFitInsideContainerItems()Z", cancellable = true)
    private void canFitInsideContainerItems_504562999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504562999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedPostProcess(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedPostProcess__360512867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360512867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText__327510609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-327510609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getItemDamageSource_1778706742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778706742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldPrintOpWarning(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void shouldPrintOpWarning__2017148009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017148009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCraftingRemainder()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getCraftingRemainder__2074795078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074795078L))
            info.setReturnValue(null);
    }


}
