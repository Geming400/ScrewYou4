package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.body.ItemBody.class)
public class ItemBody146236917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1531749176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531749176L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__989223058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989223058L))
            info.setReturnValue("Xek䟀LX&;5&컻o,#q.gIZ+xVFK+ <[q%7㕄iᣭf#5dh}IS7D#䐞]2it鲑Nw6\"Je5Z䁘@D_65=I](6+0OY'3v㠸:4鯬d26ꝟn]G8?t}h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_184499659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184499659L))
            info.setReturnValue(2088764383);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_184499163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184499163L))
            info.setReturnValue(-2003055494);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void item_1900124223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900124223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/util/Optional;", cancellable = true)
    private void description_391698339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391698339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_1882090641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882090641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_184499163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184499163L))
            info.setReturnValue(-2003055494);
    }

    @Inject(at = @At("HEAD"), method = "showDecorations()Z", cancellable = true)
    private void showDecorations_184515500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184515500L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showTooltip()Z", cancellable = true)
    private void showTooltip_184515500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184515500L))
            info.setReturnValue(true);
    }


}
