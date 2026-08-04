package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.RecipeButton.class)
public class RecipeButton1948747658Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;ZLnet/minecraft/client/gui/screens/recipebook/RecipeBookPage;Lnet/minecraft/util/context/ContextMap;)V", cancellable = true)
    private void init_258779518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(258779518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollection()Lnet/minecraft/client/gui/screens/recipebook/RecipeCollection;", cancellable = true)
    private void getCollection_1454284288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454284288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipText(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", cancellable = true)
    private void getTooltipText__1697417995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697417995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentRecipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void getCurrentRecipe__1187793618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187793618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDisplayStack__1822800978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822800978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnlyOption()Z", cancellable = true)
    private void isOnlyOption_1987026241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987026241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_1987009904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987009904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_989060286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(989060286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__1084560152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1084560152L))
            info.cancel();
    }


}
