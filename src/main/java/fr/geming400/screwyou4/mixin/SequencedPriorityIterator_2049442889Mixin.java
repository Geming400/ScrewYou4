package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SequencedPriorityIterator.class)
public class SequencedPriorityIterator_2049442889Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)V", cancellable = true)
    private void add_2077915480(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2077915480L))
            info.cancel();
    }


}
