package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStackLinkedSet.class)
public class ItemStackLinkedSet_1739656640Mixin {
        @Inject(at = @At("HEAD"), method = "createTypeAndComponentsSet()Ljava/util/Set;", cancellable = true)
    private static void createTypeAndComponentsSet__89378599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89378599L))
            info.setReturnValue(null);
    }


}
