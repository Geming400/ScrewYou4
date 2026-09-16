package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SlotRanges.class)
public class SlotRanges_512087994Mixin {
        @Inject(at = @At("HEAD"), method = "nameToIds(Ljava/lang/String;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private static void nameToIds_476628562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476628562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allNames()Ljava/util/stream/Stream;", cancellable = true)
    private static void allNames__888548257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888548257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleSlotNames()Ljava/util/stream/Stream;", cancellable = true)
    private static void singleSlotNames_747071460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747071460L))
            info.setReturnValue(null);
    }


}
