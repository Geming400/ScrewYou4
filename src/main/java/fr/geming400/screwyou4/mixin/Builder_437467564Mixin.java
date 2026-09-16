package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.Builder.class)
public class Builder_437467564Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/CreativeModeTab;", cancellable = true)
    private void build__785901585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785901585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "icon(Ljava/util/function/Supplier;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void icon_464727709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464727709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void title__228418930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228418930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayItems(Lnet/minecraft/world/item/CreativeModeTab$DisplayItemsGenerator;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void displayItems_1442050946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442050946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noScrollBar()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void noScrollBar__2001494449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001494449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void backgroundTexture_1738832143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738832143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignedRight()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void alignedRight_1325372130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325372130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideTitle()Lnet/minecraft/world/item/CreativeModeTab$Builder;", cancellable = true)
    private void hideTitle_1831445632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831445632L))
            info.setReturnValue(null);
    }


}
