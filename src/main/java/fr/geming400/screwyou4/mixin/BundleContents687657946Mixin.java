package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BundleContents.class)
public class BundleContents687657946Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1131389535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131389535L))
            info.setReturnValue(-1633738652);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__220968818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220968818L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1458080975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458080975L))
            info.setReturnValue("z6q,aC\u4AD3A\u6C96bQzC\u37F8FQ4\u1EE1*0\u5BCD_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1245009541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245009541L))
            info.setReturnValue(-1403838044);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1746774318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746774318L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items_665405898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665405898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getSelectedItem__639132440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639132440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void weight__562844591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562844591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopyStream_1878027911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878027911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canItemBeInBundle(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canItemBeInBundle_1737741441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737741441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfItemsToShow()I", cancellable = true)
    private void getNumberOfItemsToShow_1545586014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545586014L))
            info.setReturnValue(1749009997);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItemIndex()I", cancellable = true)
    private void getSelectedItemIndex_161487378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161487378L))
            info.setReturnValue(-1611881511);
    }


}
