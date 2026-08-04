package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ItemModelUtils.class)
public class ItemModelUtils_331088327Mixin {
        @Inject(at = @At("HEAD"), method = "override(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;F)Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;", cancellable = true)
    private static void override__426719230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-426719230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select__304314873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304314873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select_479622408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479622408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select_1486530357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486530357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;[Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select__2014312365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014312365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select__1925047168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925047168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Ljava/lang/Object;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;", cancellable = true)
    private static void when__543804645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543804645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Ljava/util/List;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;", cancellable = true)
    private static void when__1476919376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476919376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "composite([Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void composite_130946546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130946546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectBlockItemProperty(Lcom/mojang/math/Transformation;Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/Map;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void selectBlockItemProperty__1213387284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213387284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectBlockItemProperty(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/Map;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void selectBlockItemProperty_1763258906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763258906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel_687243876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687243876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel__1013713610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013713610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Ljava/util/Optional;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel_399225365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399225365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUsingItem()Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private static void isUsingItem_926018498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926018498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constantTint(I)Lnet/minecraft/client/color/item/ItemTintSource;", cancellable = true)
    private static void constantTint__605243510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605243510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintedModel(Lnet/minecraft/resources/Identifier;[Lnet/minecraft/client/color/item/ItemTintSource;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void tintedModel_958092511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958092511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;Lcom/mojang/math/Transformation;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void plainModel_1880298930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880298930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void plainModel__1259349536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259349536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isXmas(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void isXmas_954548882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954548882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__2029546563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029546563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;FLjava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__160694784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160694784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;FLnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__556625115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556625115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__1610745523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610745523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect_1581543576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581543576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasComponent(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private static void hasComponent_114428530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114428530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional__831358849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831358849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Ljava/util/Optional;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional_807948638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807948638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional_751060397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751060397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOverworld(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void inOverworld_954548882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954548882L))
            info.setReturnValue(null);
    }


}
