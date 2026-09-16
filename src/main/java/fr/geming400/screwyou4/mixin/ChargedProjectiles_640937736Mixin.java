package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ChargedProjectiles.class)
public class ChargedProjectiles_640937736Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__267688533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267688533L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1411361260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411361260L))
            info.setReturnValue("m^gz.U^55KR\u4A96, WcN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1198289826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198289826L))
            info.setReturnValue(815101247);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/item/ItemStackTemplate;)Lnet/minecraft/world/item/component/ChargedProjectiles;", cancellable = true)
    private static void of__790212320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790212320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1700054107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700054107L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void contains_1240497334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240497334L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items_618685687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618685687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1734282312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1734282312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/List;", cancellable = true)
    private void itemCopies_662127101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(662127101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofNonEmpty(Ljava/util/List;)Lnet/minecraft/world/item/component/ChargedProjectiles;", cancellable = true)
    private static void ofNonEmpty__45807770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45807770L))
            info.setReturnValue(null);
    }


}
