package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.Builder.class)
public class Builder_437467564Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private void build_1857708545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857708545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void title__1130517450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130517450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayItems(Lnet/minecraft/world/item/CreativeModeTab$DisplayItemsGenerator;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void displayItems__1047339548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047339548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "icon(Ljava/util/function/Supplier;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void icon_699551670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699551670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideTitle()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void hideTitle_1453578954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453578954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void backgroundTexture_1641742146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641742146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noScrollBar()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void noScrollBar_1453578954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453578954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignedRight()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void alignedRight_1453578954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453578954L))
            info.setReturnValue(null);
    }


}
