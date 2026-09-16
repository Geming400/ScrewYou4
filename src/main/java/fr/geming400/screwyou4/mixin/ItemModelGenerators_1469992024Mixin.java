package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.ItemModelGenerators.class)
public class ItemModelGenerators_1469992024Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__2061863073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2061863073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedOverlay(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void generateItemWithTintedOverlay_1150436257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1150436257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedOverlay(Lnet/minecraft/world/item/Item;Ljava/lang/String;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void generateItemWithTintedOverlay__1928264341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928264341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateItemWithTintedBaseLayer(Lnet/minecraft/world/item/Item;I)V", cancellable = true)
    private void generateItemWithTintedBaseLayer__536999454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-536999454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateStandardCompassItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateStandardCompassItem_464186726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(464186726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateRecoveryCompassItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateRecoveryCompassItem__149544562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-149544562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Ljava/lang/String;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel_1937842376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937842376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel_263608269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263608269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel__1828975854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828975854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateLayeredItem__699280085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699280085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)V", cancellable = true)
    private void generateLayeredItem__1020154098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1020154098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateLayeredItem(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateLayeredItem__779588808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779588808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateBundleModels(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBundleModels__1958101644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1958101644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateElytra(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateElytra_1049913561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1049913561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBrush(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBrush_418262680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(418262680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateFishingRod(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateFishingRod__650754171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-650754171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateGoatHorn(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateGoatHorn_734897318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734897318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateClockItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateClockItem__2138966369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2138966369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBundleCoverModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void generateBundleCoverModel_966956576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966956576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefixForSlotTrim(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void prefixForSlotTrim__27220285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27220285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCompassModels(Lnet/minecraft/world/item/Item;)Ljava/util/List;", cancellable = true)
    private void createCompassModels__1861500034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861500034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateTrimmableItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void generateTrimmableItem__2101909004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2101909004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "declareCustomModelItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void declareCustomModelItem__555843468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555843468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateFlatItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)V", cancellable = true)
    private void generateFlatItem__365718538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-365718538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateFlatItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;Lnet/minecraft/client/data/models/model/ModelTemplate;)V", cancellable = true)
    private void generateFlatItem_1405753627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405753627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateCrossbow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateCrossbow__1531803406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1531803406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBooleanDispatch(Lnet/minecraft/world/item/Item;Lnet/minecraft/client/renderer/item/properties/conditional/ConditionalItemModelProperty;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)V", cancellable = true)
    private void generateBooleanDispatch_1225273851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1225273851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateBow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateBow__1619258392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619258392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTrident(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTrident__1585375536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1585375536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateShield(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateShield_766961809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(766961809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPotionTint(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void addPotionTint__1092151798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1092151798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateDyedItem(Lnet/minecraft/world/item/Item;I)V", cancellable = true)
    private void generateDyedItem__1596010754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1596010754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generatePotion(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generatePotion__1162099269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1162099269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateSpear(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateSpear_503641015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(503641015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatModelDispatch(Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;)Lnet/minecraft/client/renderer/item/ItemModel$Unbaked;", cancellable = true)
    private static void createFlatModelDispatch_1010178257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010178257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateTippedArrow(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTippedArrow__581514381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-581514381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateSpyglass(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateSpyglass__952047704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952047704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateTwoLayerDyedItem(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void generateTwoLayerDyedItem_231881748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231881748L))
            info.cancel();
    }


}
