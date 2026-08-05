package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Empty.class)
public class Empty1360893031Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1566104038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566104038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2131316060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131316060L))
            info.setReturnValue("a6R%zmX7 53zG8\u0638V VWe%g?)u0\u3724LPI\uC02EQ\uA4D2/\u3B6F8=r&=.q)cntHUSa9\uB31C\u2ABFs]v|w");
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__1135080981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135080981L))
            info.setReturnValue(null);
    }


}
