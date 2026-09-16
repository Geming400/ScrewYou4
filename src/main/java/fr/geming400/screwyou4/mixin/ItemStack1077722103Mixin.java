package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStack.class)
public class ItemStack1077722103Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void remove_1199409606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199409606L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1848145132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848145132L))
            info.setReturnValue("-t!S\u78C9a_\u37F8Vf\u4181@#6Kk=\u69E9D7\u1C9APYhc\u53ACf\u85566FQ5SA@DfL7P5D\u283AofQ\\");
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Ljava/util/function/UnaryOperator;)Ljava/lang/Object;", cancellable = true)
    private void update_731164348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731164348L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", cancellable = true)
    private void update__1983627824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983627824L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copy__600387952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600387952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_2136838475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136838475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void matches__653368803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653368803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "split(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void split_667608872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667608872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__10448338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10448338L))
            info.setReturnValue(-1183909351);
    }

    @Inject(at = @At("HEAD"), method = "is(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void is__1934988333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1934988333L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Ljava/lang/Object;", cancellable = true)
    private void set__839843696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839843696L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set_1679901832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679901832L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount__308196828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308196828L))
            info.setReturnValue(-834864325);
    }

    @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__1732378253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732378253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grow(I)V", cancellable = true)
    private void grow_2051380470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2051380470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void copyFrom__1381539142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1381539142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__2036833023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2036833023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consume(ILnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void consume_60761477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60761477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBroken()Z", cancellable = true)
    private void isBroken_101618543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101618543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSameItem(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isSameItem__636775059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636775059L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBreakBlockInAdventureMode(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void canBreakBlockInAdventureMode_1192574578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192574578L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtEnemy(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void hurtEnemy_678468309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678468309L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setCount(I)V", cancellable = true)
    private void setCount__680040656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-680040656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void getItem__1163931564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163931564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDestroySpeed(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getDestroySpeed__1384165498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384165498L))
            info.setReturnValue(3.65837E7F);
    }

    @Inject(at = @At("HEAD"), method = "isCorrectToolForDrops(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isCorrectToolForDrops__832894550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832894550L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSameItemSameComponents(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void isSameItemSameComponents__1485433871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485433871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interactLivingEntity(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interactLivingEntity__1101555443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101555443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDamageSource(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getDamageSource__551122803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551122803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causeUseVibration(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Holder$Reference;)V", cancellable = true)
    private void causeUseVibration__2098008891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2098008891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shrink(I)V", cancellable = true)
    private void shrink__770736532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-770736532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void onUseTick_918001799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918001799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postHurtEnemy(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void postHurtEnemy_1103931537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1103931537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCustomName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getCustomName__2124499044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124499044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOnBlockInAdventureMode(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void canPlaceOnBlockInAdventureMode_480680075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480680075L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getComponents()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void getComponents__1073514376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073514376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/entity/EquipmentSlotGroup;Lorg/apache/commons/lang3/function/TriConsumer;)V", cancellable = true)
    private void forEachModifier_1330188966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1330188966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachModifier(Lnet/minecraft/world/entity/EquipmentSlot;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEachModifier_844959728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(844959728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDamageableItem()Z", cancellable = true)
    private void isDamageableItem_559661480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559661480L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeHurtBy(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void canBeHurtBy_1534208992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534208992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void hurtAndBreak__310695983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-310695983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/server/level/ServerLevel;Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void hurtAndBreak__595868443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-595868443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtAndBreak(ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void hurtAndBreak_1567417224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1567417224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSwingAnimation()Lnet/minecraft/world/item/component/SwingAnimation;", cancellable = true)
    private void getSwingAnimation__1194399396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194399396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOnRelease()Z", cancellable = true)
    private void useOnRelease__1489896723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489896723L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "finishUsingItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void finishUsingItem__579903426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579903426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsing(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;I)V", cancellable = true)
    private void releaseUsing_1664886879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1664886879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__589331758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589331758L))
            info.setReturnValue(773117837);
    }

    @Inject(at = @At("HEAD"), method = "nextDamageWillBreak()Z", cancellable = true)
    private void nextDamageWillBreak__442196381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442196381L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder_1448938925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448938925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lenientOptionalFieldOf(Ljava/lang/String;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void lenientOptionalFieldOf__689003045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689003045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHoverName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getHoverName__149071237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-149071237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidRepairItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isValidRepairItem__1215699647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1215699647L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/core/component/DataComponentType;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void addToTooltip__2030742966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2030742966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDamageValue(I)V", cancellable = true)
    private void setDamageValue_59449507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59449507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDamageValue()I", cancellable = true)
    private void getDamageValue_1617874769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617874769L))
            info.setReturnValue(2075480795);
    }

    @Inject(at = @At("HEAD"), method = "getMaxDamage()I", cancellable = true)
    private void getMaxDamage__428204864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428204864L))
            info.setReturnValue(-863890416);
    }

    @Inject(at = @At("HEAD"), method = "consumeAndReturn(ILnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void consumeAndReturn__653620497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653620497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed_202326536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202326536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getItemName_1393967422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393967422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyWithCount(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyWithCount_1165524878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165524878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrototype()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void getPrototype_1821778200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821778200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getComponentsPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void getComponentsPatch_839406972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839406972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isItemEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isItemEnabled_556206455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556206455L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe_1471125096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471125096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStackable()Z", cancellable = true)
    private void isStackable__62938410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62938410L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther__1691602705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691602705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBy(Lnet/minecraft/world/entity/player/Player;I)V", cancellable = true)
    private void onCraftedBy__711731617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-711731617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_162604870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162604870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void mineBlock__1311981151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1311981151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDamaged()Z", cancellable = true)
    private void isDamaged_125197891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125197891L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPopTime()I", cancellable = true)
    private void getPopTime__458554795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458554795L))
            info.setReturnValue(1465685082);
    }

    @Inject(at = @At("HEAD"), method = "setPopTime(I)V", cancellable = true)
    private void setPopTime__1105876961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1105876961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRarity()Lnet/minecraft/world/item/Rarity;", cancellable = true)
    private void getRarity__304683292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304683292L))
            info.setReturnValue(net.minecraft.world.item.Rarity.UNCOMMON);
    }

    @Inject(at = @At("HEAD"), method = "hasFoil()Z", cancellable = true)
    private void hasFoil__1972892664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972892664L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedBySystem(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedBySystem_1501513087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1501513087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validatedStreamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void validatedStreamCodec__1605795582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605795582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth()I", cancellable = true)
    private void getBarWidth__1728354156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728354156L))
            info.setReturnValue(-1319684549);
    }

    @Inject(at = @At("HEAD"), method = "hurtAndConvertOnBreak(ILnet/minecraft/world/level/ItemLike;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void hurtAndConvertOnBreak__721273628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721273628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNonDefault(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void hasNonDefault__966276912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966276912L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBarColor()I", cancellable = true)
    private void getBarColor_1148444951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148444951L))
            info.setReturnValue(-1509695719);
    }

    @Inject(at = @At("HEAD"), method = "listMatches(Ljava/util/List;Ljava/util/List;)Z", cancellable = true)
    private static void listMatches__1817362317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817362317L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matchesIgnoringComponents(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Predicate;)Z", cancellable = true)
    private static void matchesIgnoringComponents_1200787047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200787047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashItemAndComponents(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void hashItemAndComponents__1398918674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398918674L))
            info.setReturnValue(1359259517);
    }

    @Inject(at = @At("HEAD"), method = "hashStackList(Ljava/util/List;)I", cancellable = true)
    private static void hashStackList_1159439022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159439022L))
            info.setReturnValue(-1675327993);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible()Z", cancellable = true)
    private void isBarVisible__1729948251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729948251L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "immutableComponents()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void immutableComponents__226730548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226730548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndClear()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyAndClear_313965158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313965158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateStrict(Lnet/minecraft/world/item/ItemStack;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void validateStrict__953239708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953239708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage()Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage_1397287219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397287219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtWithoutBreaking(ILnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void hurtWithoutBreaking__1824640582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1824640582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnchantments()Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private void getEnchantments_1298144407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298144407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnchanted()Z", cancellable = true)
    private void isEnchanted__648600128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648600128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addDetailsToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;Ljava/util/function/Consumer;)V", cancellable = true)
    private void addDetailsToTooltip__2087732119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2087732119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation()Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1844425069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844425069L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPYGLASS);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__1519184391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1519184391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStyledHoverName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getStyledHoverName__1085995224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085995224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipLines(Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/TooltipFlag;)Ljava/util/List;", cancellable = true)
    private void getTooltipLines_317401302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317401302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlock(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canDestroyBlock__2132060326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132060326L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyComponentsAndValidate(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyComponentsAndValidate__87615321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87615321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEnchantable()Z", cancellable = true)
    private void isEnchantable_1253624229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253624229L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "transmuteCopy(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void transmuteCopy__821709016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821709016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transmuteCopy(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void transmuteCopy_377741205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377741205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitSize(I)V", cancellable = true)
    private void limitSize__1502758785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1502758785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enchant(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void enchant__1221414917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1221414917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyComponents(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyComponents_1149398850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149398850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyComponents(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void applyComponents__844700178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-844700178L))
            info.cancel();
    }


}
