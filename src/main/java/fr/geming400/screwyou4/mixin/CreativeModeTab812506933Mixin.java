package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.class)
public class CreativeModeTab812506933Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/world/item/CreativeModeTab$Row;I)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private static void builder__1217671623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217671623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void contains_1543602130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543602130L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/CreativeModeTab$Type;", cancellable = true)
    private void getType_1827728643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827728643L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.Type.SEARCH);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1992919103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992919103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column()I", cancellable = true)
    private void column__75266171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75266171L))
            info.setReturnValue(-358375053);
    }

    @Inject(at = @At("HEAD"), method = "row()Lnet/minecraft/world/item/CreativeModeTab$Row;", cancellable = true)
    private void row__1531879025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531879025L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.Row.BOTTOM);
    }

    @Inject(at = @At("HEAD"), method = "canScroll()Z", cancellable = true)
    private void canScroll_311061583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311061583L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showTitle()Z", cancellable = true)
    private void showTitle_580216945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580216945L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldDisplay()Z", cancellable = true)
    private void shouldDisplay__30901571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30901571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "buildContents(Lnet/minecraft/world/item/CreativeModeTab$ItemDisplayParameters;)V", cancellable = true)
    private void buildContents__1409466814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409466814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSearchTabDisplayItems()Ljava/util/Collection;", cancellable = true)
    private void getSearchTabDisplayItems_1004175162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004175162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAnyItems()Z", cancellable = true)
    private void hasAnyItems__1266816066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266816066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAlignedRight()Z", cancellable = true)
    private void isAlignedRight_141178314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141178314L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getIconItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getIconItem__1509861893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509861893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTextureLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void createTextureLocation_1852946302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852946302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getBackgroundTexture__177058093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177058093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayItems()Ljava/util/Collection;", cancellable = true)
    private void getDisplayItems__1651993287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651993287L))
            info.setReturnValue(null);
    }


}
