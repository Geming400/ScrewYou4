package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStack.class)
public class ItemStack1077722103Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void remove_914629698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914629698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__57738368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57738368L))
            info.setReturnValue("LT&M!}");
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Ljava/util/function/UnaryOperator;)Ljava/lang/Object;", cancellable = true)
    private void update_1542290227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542290227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", cancellable = true)
    private void update__1240984455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240984455L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copy_1601140763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601140763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void matches__1971648400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971648400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "split(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void split__1823326974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823326974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is_1148082493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148082493L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Ljava/lang/Object;", cancellable = true)
    private void set_1537539890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537539890L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__1250288090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250288090L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use_1488098138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488098138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grow(I)V", cancellable = true)
    private void grow__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void copyFrom__1682133927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1682133927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1099187062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099187062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consume(ILnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void consume__1763170047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1763170047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void getItem_558786685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558786685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lenientOptionalFieldOf(Ljava/lang/String;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void lenientOptionalFieldOf__1448354539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448354539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDamaged()Z", cancellable = true)
    private void isDamaged_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRarity()Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private void getRarity_1321915109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321915109L))
            info.setReturnValue(net.minecraft.world.item.Rarity.COMMON);
    }

    @Inject(at = @At("HEAD"), method = "hasFoil()Z", cancellable = true)
    private void hasFoil_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPopTime()I", cancellable = true)
    private void getPopTime_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "setPopTime(I)V", cancellable = true)
    private void setPopTime__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void mineBlock__93811493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-93811493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__831121152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831121152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBySystem(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedBySystem_72747161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(72747161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validateStrict(Lnet/minecraft/world/item/ItemStack;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validateStrict__1155722109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155722109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage()Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage_1323183525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323183525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immutableComponents()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void immutableComponents__2013440252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013440252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validatedStreamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void validatedStreamCodec__1193005702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193005702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNonDefault(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void hasNonDefault_1719138558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719138558L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStyledHoverName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getStyledHoverName__1099187062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099187062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyComponentsAndValidate(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyComponentsAndValidate__1388953314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1388953314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBarColor()I", cancellable = true)
    private void getBarColor_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "listMatches(Ljava/util/List;Ljava/util/List;)Z", cancellable = true)
    private static void listMatches__47225336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47225336L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashItemAndComponents(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void hashItemAndComponents__1482726150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482726150L))
            info.setReturnValue(-1146138990);
    }

    @Inject(at = @At("HEAD"), method = "hashStackList(Ljava/util/List;)I", cancellable = true)
    private static void hashStackList_298491270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(298491270L))
            info.setReturnValue(56248631);
    }

    @Inject(at = @At("HEAD"), method = "matchesIgnoringComponents(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Predicate;)Z", cancellable = true)
    private static void matchesIgnoringComponents_1795674751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795674751L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copyAndClear()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyAndClear_1601140763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601140763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantments()Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private void getEnchantments__1548465047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548465047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDetailsToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDetailsToTooltip_505001840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505001840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth()I", cancellable = true)
    private void getBarWidth_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canDestroyBlock_937080925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937080925L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtAndConvertOnBreak(ILnet/minecraft/world/level/ItemLike;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void hurtAndConvertOnBreak__895483313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895483313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick_1127033778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1127033778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTooltipLines(Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;)Ljava/util/List;", cancellable = true)
    private void getTooltipLines__1775352284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775352284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnchanted()Z", cancellable = true)
    private void isEnchanted_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible()Z", cancellable = true)
    private void isBarVisible_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtWithoutBreaking(ILnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void hurtWithoutBreaking__1531615650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1531615650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation()Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_766624256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766624256L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPEAR);
    }

    @Inject(at = @At("HEAD"), method = "setCount(I)V", cancellable = true)
    private void setCount__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void addToTooltip_705236433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(705236433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDamageableItem()Z", cancellable = true)
    private void isDamageableItem_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSwingAnimation()Lnet/minecraft/world/item/component/SwingAnimation;", cancellable = true)
    private void getSwingAnimation_2145288184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145288184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeHurtBy(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void canBeHurtBy_746052487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746052487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/entity/EquipmentSlotGroup;Lorg/apache/commons/lang3/function/TriConsumer;)V", cancellable = true)
    private void forEachModifier__1428667993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1428667993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachModifier__1892326833(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1892326833L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void releaseUsing_733624738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(733624738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease()Z", cancellable = true)
    private void useOnRelease_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_1399372941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399372941L))
            info.setReturnValue(150056283);
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__1074549030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074549030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextDamageWillBreak()Z", cancellable = true)
    private void nextDamageWillBreak_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copyWithCount(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyWithCount__1823326974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823326974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed_638753218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638753218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getItemName__1099187062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099187062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe_889764226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889764226L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther_1902105401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902105401L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isStackable()Z", cancellable = true)
    private void isStackable_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBy(Lnet/minecraft/world/entity/player/Player;I)V", cancellable = true)
    private void onCraftedBy_199002120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(199002120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOnBlockInAdventureMode(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void canPlaceOnBlockInAdventureMode__1607980670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607980670L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBreakBlockInAdventureMode(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void canBreakBlockInAdventureMode__1607980670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607980670L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDestroySpeed(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getDestroySpeed_932413897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932413897L))
            info.setReturnValue(1.046927E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__1099187062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099187062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/server/level/ServerLevel;Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void hurtAndBreak_1517214670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517214670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void hurtAndBreak_880550586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880550586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void hurtAndBreak__1617866177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1617866177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getComponents()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void getComponents__2013440252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013440252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCorrectToolForDrops(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectToolForDrops_932433117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932433117L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity__702969457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-702969457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getDamageSource__1904822867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904822867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy_1129351338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1129351338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSameItemSameComponents(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isSameItemSameComponents__1971648400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971648400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "causeUseVibration(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void causeUseVibration_79920153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79920153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDamageValue(I)V", cancellable = true)
    private void setDamageValue__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxDamage()I", cancellable = true)
    private void getMaxDamage_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "getDamageValue()I", cancellable = true)
    private void getDamageValue_1115984349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115984349L))
            info.setReturnValue(833611295);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder__1668369421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668369421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shrink(I)V", cancellable = true)
    private void shrink__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidRepairItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isValidRepairItem__1482710061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482710061L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHoverName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getHoverName__1099187062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099187062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSameItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isSameItem__1971648400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971648400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void hurtEnemy_1129355182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129355182L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onUseTick_733624738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(733624738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPrototype()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void getPrototype__2013440252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013440252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getComponentsPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void getComponentsPatch__647452520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647452520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isItemEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isItemEnabled__352047277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352047277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEnchantable()Z", cancellable = true)
    private void isEnchantable_1116000686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116000686L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "transmuteCopy(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void transmuteCopy__1878070190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878070190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transmuteCopy(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void transmuteCopy_1990283179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990283179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumeAndReturn(ILnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void consumeAndReturn_169769572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169769572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitSize(I)V", cancellable = true)
    private void limitSize__2003328221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2003328221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void enchant_1801211188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1801211188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyComponents(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyComponents__1388953314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1388953314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyComponents(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void applyComponents_1503493834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1503493834L))
            info.cancel();
    }


}
