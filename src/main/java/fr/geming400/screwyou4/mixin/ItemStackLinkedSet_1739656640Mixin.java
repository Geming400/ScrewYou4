package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStackLinkedSet.class)
public class ItemStackLinkedSet_1739656640Mixin {
        @Inject(at = @At("HEAD"), method = "createTypeAndComponentsSet()Ljava/util/Set;", cancellable = true)
    private static void createTypeAndComponentsSet__1805651026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805651026L))
            info.setReturnValue(null);
    }


}
