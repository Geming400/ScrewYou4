package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.class)
public class CreativeModeTab812506933Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/item/CreativeModeTab$Row;I)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private static void builder__1977732876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977732876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void contains__1747925231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747925231L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/CreativeModeTab$Type;", cancellable = true)
    private void getType__1833295181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833295181L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.Type.INVENTORY);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1364402232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364402232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column()I", cancellable = true)
    private void column_850769179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850769179L))
            info.setReturnValue(2011964280);
    }

    @Inject(at = @At("HEAD"), method = "row()Lnet/minecraft/world/item/CreativeModeTab$Row;", cancellable = true)
    private void row_2046333493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046333493L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.Row.TOP);
    }

    @Inject(at = @At("HEAD"), method = "canScroll()Z", cancellable = true)
    private void canScroll_850785516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850785516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showTitle()Z", cancellable = true)
    private void showTitle_850785516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850785516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "buildContents(Lnet/minecraft/world/item/CreativeModeTab$ItemDisplayParameters;)V", cancellable = true)
    private void buildContents_1401072874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1401072874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldDisplay()Z", cancellable = true)
    private void shouldDisplay_850785516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850785516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSearchTabDisplayItems()Ljava/util/Collection;", cancellable = true)
    private void getSearchTabDisplayItems__1001141339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001141339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyItems()Z", cancellable = true)
    private void hasAnyItems_850785516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850785516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getBackgroundTexture__1630559620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630559620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTextureLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void createTextureLocation__606422230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606422230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayItems()Ljava/util/Collection;", cancellable = true)
    private void getDisplayItems__1001141339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001141339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIconItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getIconItem_1335925593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335925593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAlignedRight()Z", cancellable = true)
    private void isAlignedRight_850785516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850785516L))
            info.setReturnValue(true);
    }


}
