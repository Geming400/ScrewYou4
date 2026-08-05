package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ItemModelGenerators.class)
public class ItemModelGenerators_1469992024Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1508266762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1508266762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateClockItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateClockItem__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prefixForSlotTrim(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void prefixForSlotTrim_51062860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51062860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateFlatItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)V", cancellable = true)
    private void generateFlatItem__413327172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-413327172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateFlatItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)V", cancellable = true)
    private void generateFlatItem_597376117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(597376117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBundleCoverModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateBundleCoverModel_1011775657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011775657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBundleModels(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBundleModels__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateElytra(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateElytra__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateFishingRod(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateFishingRod__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateShield(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateShield__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTrident(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTrident__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCompassModels(Lnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private void createCompassModels_1794529790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794529790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateCrossbow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateCrossbow__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "declareCustomModelItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void declareCustomModelItem__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateLayeredItem__1270203126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270203126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateLayeredItem_1185196057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185196057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)V", cancellable = true)
    private void generateLayeredItem_1637226492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1637226492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBrush(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBrush__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateGoatHorn(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateGoatHorn__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatModelDispatch(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void createFlatModelDispatch_2093452579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093452579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateSpyglass(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateSpyglass__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTrimmableItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void generateTrimmableItem_337078673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(337078673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBow__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateSpear(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateSpear__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBooleanDispatch(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)V", cancellable = true)
    private void generateBooleanDispatch__1241881490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1241881490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateDyedItem(Lnet/minecraft/world/item/Item;I)V", cancellable = true)
    private void generateDyedItem_1710127930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710127930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTippedArrow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTippedArrow__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generatePotion(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generatePotion__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTwoLayerDyedItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTwoLayerDyedItem__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPotionTint(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void addPotionTint_1942773339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1942773339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel__435560397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435560397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel_1315315340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315315340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Ljava/lang/String;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel_1134186409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134186409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRecoveryCompassItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateRecoveryCompassItem__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedBaseLayer(Lnet/minecraft/world/item/Item;I)V", cancellable = true)
    private void generateItemWithTintedBaseLayer_1710127930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710127930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateStandardCompassItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateStandardCompassItem__1294091693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294091693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedOverlay(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void generateItemWithTintedOverlay_1881464313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1881464313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedOverlay(Lnet/minecraft/world/item/Item;Ljava/lang/String;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void generateItemWithTintedOverlay__377308733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-377308733L))
            info.cancel();
    }


}
