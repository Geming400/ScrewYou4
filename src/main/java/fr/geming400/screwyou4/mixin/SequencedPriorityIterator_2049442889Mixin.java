package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SequencedPriorityIterator.class)
public class SequencedPriorityIterator_2049442889Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)V", cancellable = true)
    private void add__1890296071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1890296071L))
            info.cancel();
    }


}
