package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SlotRanges.class)
public class SlotRanges_512087994Mixin {
        @Inject(at = @At("HEAD"), method = "singleSlotNames()Ljava/util/stream/Stream;", cancellable = true)
    private static void singleSlotNames_301381926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301381926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allNames()Ljava/util/stream/Stream;", cancellable = true)
    private static void allNames_301381926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301381926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameToIds(Ljava/lang/String;)Lnet/minecraft/world/inventory/SlotRange;", cancellable = true)
    private static void nameToIds__1759479036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759479036L))
            info.setReturnValue(null);
    }


}
