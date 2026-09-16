package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.TagSlotDisplay.class)
public class TagSlotDisplay_1532248950Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1737459956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737459956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_623622681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623622681L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1992294822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1992294822L))
            info.setReturnValue("=8\uFDB4O\uAA00 %rlj mR\u221F1\u075Bzx=V<{wY0% [z.=(29y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2089601040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089601040L))
            info.setReturnValue(1151343008);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__963725063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963725063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void tag__1167959240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167959240L))
            info.setReturnValue(null);
    }


}
