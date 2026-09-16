package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ItemModelUtils.class)
public class ItemModelUtils_331088327Mixin {
        @Inject(at = @At("HEAD"), method = "override(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;F)Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;", cancellable = true)
    private static void override__950866738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950866738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select_1892799281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892799281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select__2029731325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029731325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select__216057596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216057596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select_962944380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962944380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty;[Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void select_872866127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872866127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Ljava/util/List;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;", cancellable = true)
    private static void when_401470902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401470902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "when(Ljava/lang/Object;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/SelectItemModel$SwitchCase;", cancellable = true)
    private static void when_702988193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702988193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "composite([Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void composite_1209939531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209939531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUsingItem()Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private static void isUsingItem__1081746961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081746961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional__172225101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172225101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional_2035853445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035853445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "conditional(Ljava/util/Optional;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void conditional__1560159644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560159644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintedModel(Lnet/minecraft/resources/Identifier;[Lnet/minecraft/client/color/item/ItemTintSource;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void tintedModel_1968718480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968718480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constantTint(I)Lnet/minecraft/client/color/item/ItemTintSource;", cancellable = true)
    private static void constantTint_831911979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831911979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectBlockItemProperty(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/Map;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void selectBlockItemProperty_1390250611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390250611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectBlockItemProperty(Lcom/mojang/math/Transformation;Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/Map;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void selectBlockItemProperty_2047992389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047992389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel__739877804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739877804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Lcom/mojang/math/Transformation;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel__887091418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887091418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModel(Lnet/minecraft/resources/Identifier;Ljava/util/Optional;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void specialModel_1824207877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824207877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;Lcom/mojang/math/Transformation;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void plainModel__786515727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786515727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void plainModel__819971809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819971809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isXmas(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void isXmas_1228739587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228739587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inOverworld(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void inOverworld__2010970261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2010970261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasComponent(Lnet/minecraft/core/component/DataComponentType;)Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;", cancellable = true)
    private static void hasComponent__1660770955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660770955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;FLjava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect_2052719175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052719175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__91736106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91736106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect_1617597286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617597286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;FLnet/minecraft/client/renderer/item/ItemModel$Unbaked;[Lnet/minecraft/client/renderer/item/RangeSelectItemModel$Entry;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect__614043092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614043092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeSelect(Lnet/minecraft/client/renderer/item/properties/numeric/RangeSelectItemModelProperty;Ljava/util/List;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void rangeSelect_267470705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267470705L))
            info.setReturnValue(null);
    }


}
