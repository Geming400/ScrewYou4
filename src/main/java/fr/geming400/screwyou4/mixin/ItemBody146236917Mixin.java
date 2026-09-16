package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.body.ItemBody.class)
public class ItemBody146236917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__762389351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762389351L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_916660442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916660442L))
            info.setReturnValue("\u31B7+KTx\u05B2]G9\u0846StuJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_703589008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703589008L))
            info.setReturnValue(-46988513);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1493911083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493911083L))
            info.setReturnValue(-1084977172);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void item__5799598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5799598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/util/Optional;", cancellable = true)
    private void description_2021730207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021730207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__939111660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-939111660L))
            info.setReturnValue(-1242682050);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__597758153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597758153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showDecorations()Z", cancellable = true)
    private void showDecorations_1693435110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693435110L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showTooltip()Z", cancellable = true)
    private void showTooltip__1065627354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065627354L))
            info.setReturnValue(false);
    }


}
