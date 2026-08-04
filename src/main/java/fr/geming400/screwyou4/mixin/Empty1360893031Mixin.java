package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Empty.class)
public class Empty1360893031Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_2075728556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075728556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_225432560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225432560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__221222657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221222657L))
            info.setReturnValue(null);
    }


}
