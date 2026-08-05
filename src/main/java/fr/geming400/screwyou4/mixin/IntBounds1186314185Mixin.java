package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.BlockUtil.IntBounds.class)
public class IntBounds1186314185Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1956737214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956737214L))
            info.setReturnValue("^[7VN7L%HKzPi,'2;xgddPY%C7r6@M>lq^q5\u752D#");
    }


}
